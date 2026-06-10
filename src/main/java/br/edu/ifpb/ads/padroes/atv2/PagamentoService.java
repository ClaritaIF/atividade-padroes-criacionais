package br.edu.ifpb.ads.padroes.atv2;

import com.google.inject.Inject;

public class PagamentoService {

    private final PagamentoGateway pagamentoGateway;

    @Inject
    public PagamentoService(PagamentoGateway pagamentoGateway) {
        this.pagamentoGateway = pagamentoGateway;
    }

    public ResultadoPagamento pagar(Pagamento pagamento) {
        return pagamentoGateway.pagar(pagamento);
    }

}
