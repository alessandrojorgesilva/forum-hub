package br.com.alura.forumhub.domain.topico;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroTopico(
                                  @NotBlank
                                  @NotNull
                                  String titulo,
                                  @NotBlank
                                  @NotNull
                                  String mensagem,
                                  //@Future
                                  //@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
                                  LocalDateTime dataCriacao,
                                  @NotNull
                                  Status status,
                                  @NotBlank
                                  @NotNull
                                  String autor,
                                  @NotBlank
                                  @NotNull
                                  String curso) {
}
