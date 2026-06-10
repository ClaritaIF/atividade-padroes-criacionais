package br.edu.ifpb.ads.padroes.atv2.sdk.paypal;

import java.math.BigDecimal;
import java.util.UUID;

public class PayPalClient {

    public PayPalPaymentResponse enviarPagamento(BigDecimal total, String moeda, String descricao) {
        return new PayPalPaymentResponse("PAYPAL-" + UUID.randomUUID(), "COMPLETED",
                "Pagamento PayPal aprovado para " + descricao + " (" + moeda + " " + total + ")");
    }

}
