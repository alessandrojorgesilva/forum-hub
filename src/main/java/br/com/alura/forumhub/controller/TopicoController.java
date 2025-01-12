package br.com.alura.forumhub.controller;

import br.com.alura.forumhub.domain.topico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/topico")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroTopico dados){
        topicoRepository.save(new Topico(dados));
    }

    @GetMapping
    public Page<DadosListagemTopicos> listar(@PageableDefault(size = 10, sort = {"dataCriacao"})Pageable paginacao){
        return topicoRepository.findAll(paginacao).map(DadosListagemTopicos::new);
    }

    @PutMapping()
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoTopico dados){
        var topico = topicoRepository.getReferenceById(dados.id());
        topico.atualizarTopico(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir (@PathVariable Long id){
        Optional<Topico> topico = topicoRepository.findById(id);
        if(topico.isPresent()){
            topicoRepository.deleteById(id);
        }else{
            System.out.println("Recurso não pode ser deletado, pois o mesmo não existe");
        }
    }

}
