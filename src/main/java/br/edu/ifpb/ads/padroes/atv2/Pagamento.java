package br.edu.ifpb.ads.padroes.atv2;

import java.math.BigDecimal;
import java.util.Objects;

public class Pagamento {

    private final BigDecimal valor;
    private final String moeda;
    private final String descricao;

    public Pagamento(BigDecimal valor, String moeda, String descricao) {
        this.valor = validarValor(valor);
        this.moeda = validarTexto(moeda, "moeda");
        this.descricao = validarTexto(descricao, "descricao");
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

    private static BigDecimal validarValor(BigDecimal valor) {
        Objects.requireNonNull(valor, "valor deve ser informado");
        if (valor.signum() <= 0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }
        return valor;
    }

    private static String validarTexto(String texto, String campo) {
        Objects.requireNonNull(texto, campo + " deve ser informado");
        if (texto.isBlank()) {
            throw new IllegalArgumentException(campo + " nao pode ficar em branco");
        }
        return texto;
    }

}
