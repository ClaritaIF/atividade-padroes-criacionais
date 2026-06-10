package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.Pagamento;
import br.edu.ifpb.ads.padroes.atv2.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.ResultadoPagamento;
import br.edu.ifpb.ads.padroes.atv2.sdk.paypal.PayPalClient;
import br.edu.ifpb.ads.padroes.atv2.sdk.paypal.PayPalPaymentResponse;
import com.google.inject.Inject;

public class PayPalPagamentoGateway implements PagamentoGateway {

    private final PayPalClient client;

    @Inject
    public PayPalPagamentoGateway(PayPalClient client) {
        this.client = client;
    }

    @Override
    public ResultadoPagamento pagar(Pagamento pagamento) {
        PayPalPaymentResponse resposta = client.enviarPagamento(
                pagamento.getValor(), pagamento.getMoeda(), pagamento.getDescricao());

        return new ResultadoPagamento("PayPal", resposta.getId(),
                "COMPLETED".equals(resposta.getStatus()), resposta.getDetalhe());
    }

}
