package br.edu.ifpb.ads.padroes.atv2;

public class ResultadoPagamento {

    private final String provedor;
    private final String transacaoId;
    private final boolean aprovado;
    private final String mensagem;

    public ResultadoPagamento(String provedor, String transacaoId, boolean aprovado, String mensagem) {
        this.provedor = provedor;
        this.transacaoId = transacaoId;
        this.aprovado = aprovado;
        this.mensagem = mensagem;
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
