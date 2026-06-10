package br.edu.ifpb.ads.padroes.atv2;

import com.google.inject.Inject;
import java.util.Objects;

public class PagamentoService {

    private final PagamentoGateway pagamentoGateway;

    @Inject
    public PagamentoService(PagamentoGateway pagamentoGateway) {
        this.pagamentoGateway = Objects.requireNonNull(pagamentoGateway,
                "pagamentoGateway deve ser informado");
    }

    public ResultadoPagamento pagar(Pagamento pagamento) {
        return pagamentoGateway.pagar(Objects.requireNonNull(pagamento, "pagamento deve ser informado"));
    }

}
