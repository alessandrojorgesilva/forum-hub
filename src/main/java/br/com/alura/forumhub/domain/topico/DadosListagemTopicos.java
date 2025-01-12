package br.com.alura.forumhub.domain.topico;

import java.time.LocalDateTime;

public record DadosListagemTopicos (Long id, String título, String mensagem, LocalDateTime dataCriacao, Status status, String autor, String curso){

    public DadosListagemTopicos(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getStatus(), topico.getAutor(), topico.getCurso());

    }
}
