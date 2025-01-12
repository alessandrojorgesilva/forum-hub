package br.com.alura.forumhub.domain.topico;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroTopico(
                                  @NotBlank
                                  String titulo,
                                  @NotBlank
                                  String mensagem,
                                  //@Future
                                  //@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
                                  LocalDateTime dataCriacao,
                                  Status status,
                                  @NotBlank
                                  String autor,
                                  @NotBlank
                                  String curso) {
}
