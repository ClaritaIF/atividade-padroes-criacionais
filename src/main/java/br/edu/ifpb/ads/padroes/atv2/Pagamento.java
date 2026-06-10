package br.edu.ifpb.ads.padroes.atv2;

import java.math.BigDecimal;

public class Pagamento {

    private final BigDecimal valor;
    private final String moeda;
    private final String descricao;

    public Pagamento(BigDecimal valor, String moeda, String descricao) {
        this.valor = valor;
        this.moeda = moeda;
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getMoeda() {
        return moeda;
    }

    public String getDescricao() {
        return descricao;
    }

}
