package br.edu.ifpb.ads.padroes.atv2.sdk.pagseguro;

import java.math.BigDecimal;
import java.util.UUID;

public class PagSeguroClient {

    public PagSeguroTransaction checkout(BigDecimal valor, String moeda, String item) {
        return new PagSeguroTransaction("PAGSEGURO-" + UUID.randomUUID(), 3,
                "Checkout PagSeguro autorizado para " + item + " (" + moeda + " " + valor + ")");
    }

}
