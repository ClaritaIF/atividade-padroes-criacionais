package br.edu.ifpb.ads.padroes.atv1.rpg.equipamento;

import br.edu.ifpb.ads.padroes.atv1.rpg.ClassePersonagem;

public final class EquipamentoFactories {

    private EquipamentoFactories() {
    }

    public static EquipamentoFactory para(ClassePersonagem classe) {
        return switch (classe) {
            case GUERREIRO -> new EquipamentoGuerreiroFactory();
            case MAGO -> new EquipamentoMagoFactory();
            case ARQUEIRO -> new EquipamentoArqueiroFactory();
        };
    }

}
