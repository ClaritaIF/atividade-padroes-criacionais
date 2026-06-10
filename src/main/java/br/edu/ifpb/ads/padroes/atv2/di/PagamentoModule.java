package br.edu.ifpb.ads.padroes.atv2.di;

import br.edu.ifpb.ads.padroes.atv2.PagamentoGateway;
import com.google.inject.AbstractModule;
import java.util.Objects;

public class PagamentoModule extends AbstractModule {

    private final Class<? extends PagamentoGateway> gateway;

    public PagamentoModule(Class<? extends PagamentoGateway> gateway) {
        this.gateway = Objects.requireNonNull(gateway, "gateway deve ser informado");
    }

    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(gateway);
    }

}
