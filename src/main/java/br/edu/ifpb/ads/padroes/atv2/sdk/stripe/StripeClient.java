package br.edu.ifpb.ads.padroes.atv2.sdk.stripe;

import java.math.BigDecimal;
import java.util.UUID;

public class StripeClient {

    public StripeCharge criarCobranca(BigDecimal amount, String currency, String statementDescriptor) {
        return new StripeCharge("STRIPE-" + UUID.randomUUID(), true,
                "Cobranca Stripe criada: " + statementDescriptor + " (" + currency + " " + amount + ")");
    }

}
