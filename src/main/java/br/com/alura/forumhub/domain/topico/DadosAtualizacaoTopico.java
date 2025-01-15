package br.com.alura.forumhub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(@NotNull
                                     Long id,
                                     String título,
                                     String mensagem,
                                     Status status) {
}
