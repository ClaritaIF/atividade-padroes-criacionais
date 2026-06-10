package br.edu.ifpb.ads.padroes.atv1.rpg.equipamento;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Raca;

public class EquipamentoArqueiroFactory implements EquipamentoFactory {

    @Override
    public Arma criarArma(Raca raca) {
        return switch (raca) {
            case HUMANO -> new Arma("Arco \u00c9lfico", 20, "Arco");
            case ELFO -> new Arma("Arco Longo \u00c9lfico", 28, "Arco");
            case ORC -> new Arma("Arco de Osso", 24, "Arco");
        };
    }

    @Override
    public Armadura criarArmadura(Raca raca) {
        return switch (raca) {
            case HUMANO -> new Armadura("Armadura de Couro", 12, "M\u00e9dia");
            case ELFO -> new Armadura("Armadura de Couro \u00c9lfico", 14, "M\u00e9dia");
            case ORC -> new Armadura("Couro de Besta", 16, "M\u00e9dia");
        };
    }

}
