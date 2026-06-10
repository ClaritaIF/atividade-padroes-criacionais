package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.Pagamento;
import br.edu.ifpb.ads.padroes.atv2.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.ResultadoPagamento;
import br.edu.ifpb.ads.padroes.atv2.sdk.stripe.StripeCharge;
import br.edu.ifpb.ads.padroes.atv2.sdk.stripe.StripeClient;
import com.google.inject.Inject;

public class StripePagamentoGateway implements PagamentoGateway {

    private final StripeClient client;

    @Inject
    public StripePagamentoGateway(StripeClient client) {
        this.client = client;
    }

    @Override
    public ResultadoPagamento pagar(Pagamento pagamento) {
        StripeCharge charge = client.criarCobranca(
                pagamento.getValor(), pagamento.getMoeda(), pagamento.getDescricao());

        return new ResultadoPagamento("Stripe", charge.getChargeId(), charge.isPaid(), charge.getReceipt());
    }

}
