package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica;

import br.edu.ifpb.ads.padroes.atv1.rpg.Raca;

public final class FabricaPersonagemProvider {

    private FabricaPersonagemProvider() {
    }

    public static FabricaPersonagem para(Raca raca) {
        return switch (raca) {
            case HUMANO -> new FabricaHumano();
            case ELFO -> new FabricaElfo();
            case ORC -> new FabricaOrc();
        };
    }

}
