package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.Pagamento;
import br.edu.ifpb.ads.padroes.atv2.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.ResultadoPagamento;
import br.edu.ifpb.ads.padroes.atv2.sdk.pagseguro.PagSeguroClient;
import br.edu.ifpb.ads.padroes.atv2.sdk.pagseguro.PagSeguroTransaction;
import com.google.inject.Inject;

public class PagSeguroPagamentoGateway implements PagamentoGateway {

    private final PagSeguroClient client;

    @Inject
    public PagSeguroPagamentoGateway(PagSeguroClient client) {
        this.client = client;
    }

    @Override
    public ResultadoPagamento pagar(Pagamento pagamento) {
        PagSeguroTransaction transaction = client.checkout(
                pagamento.getValor(), pagamento.getMoeda(), pagamento.getDescricao());

        return new ResultadoPagamento("PagSeguro", transaction.getCodigo(),
                transaction.getStatus() == 3, transaction.getDescricaoStatus());
    }

}
