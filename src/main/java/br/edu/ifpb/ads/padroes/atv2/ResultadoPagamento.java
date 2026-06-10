package br.edu.ifpb.ads.padroes.atv2;

import java.util.Objects;

public class ResultadoPagamento {

    private final String provedor;
    private final String transacaoId;
    private final boolean aprovado;
    private final String mensagem;

    public ResultadoPagamento(String provedor, String transacaoId, boolean aprovado, String mensagem) {
        this.provedor = Objects.requireNonNull(provedor, "provedor deve ser informado");
        this.transacaoId = Objects.requireNonNull(transacaoId, "transacaoId deve ser informado");
        this.aprovado = aprovado;
        this.mensagem = Objects.requireNonNull(mensagem, "mensagem deve ser informada");
    }

    public String getProvedor() {
        return provedor;
    }

    public String getTransacaoId() {
        return transacaoId;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s - transacao: %s",
                provedor, aprovado ? "aprovado" : "recusado", transacaoId);
    }

}
