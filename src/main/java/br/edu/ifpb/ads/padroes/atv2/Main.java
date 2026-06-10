package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.di.PagamentoModule;
import br.edu.ifpb.ads.padroes.atv2.gateway.PagSeguroPagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.PayPalPagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.StripePagamentoGateway;
import com.google.inject.Guice;
import com.google.inject.Injector;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento(new BigDecimal("149.90"), "BRL", "Pedido #1001");

        pagarCom(PayPalPagamentoGateway.class, pagamento);
        pagarCom(StripePagamentoGateway.class, pagamento);
        pagarCom(PagSeguroPagamentoGateway.class, pagamento);
    }

    private static void pagarCom(Class<? extends PagamentoGateway> gateway, Pagamento pagamento) {
        Injector injector = Guice.createInjector(new PagamentoModule(gateway));
        PagamentoService service = injector.getInstance(PagamentoService.class);

        ResultadoPagamento resultado = service.pagar(pagamento);
        System.out.println(resultado);
        System.out.println(resultado.getMensagem());
    }

}
