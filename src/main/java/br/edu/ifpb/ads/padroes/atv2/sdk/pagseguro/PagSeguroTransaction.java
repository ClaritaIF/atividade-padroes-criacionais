package br.edu.ifpb.ads.padroes.atv2.sdk.pagseguro;

public class PagSeguroTransaction {

    private final String codigo;
    private final int status;
    private final String descricaoStatus;

    public PagSeguroTransaction(String codigo, int status, String descricaoStatus) {
        this.codigo = codigo;
        this.status = status;
        this.descricaoStatus = descricaoStatus;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getStatus() {
        return status;
    }

    public String getDescricaoStatus() {
        return descricaoStatus;
    }

}
