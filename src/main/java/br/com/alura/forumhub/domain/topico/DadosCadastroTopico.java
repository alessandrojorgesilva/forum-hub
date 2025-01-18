package br.com.alura.forumhub.domain.topico;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record DadosCadastroTopico(
                                  @NotBlank
                                  String titulo,
                                  @NotBlank
                                  String mensagem,
                                  @Future
                                  LocalDateTime dataCriacao,
                                  Status status,
                                  @NotBlank
                                  String autor,
                                  @NotBlank
                                  String curso) {
}
