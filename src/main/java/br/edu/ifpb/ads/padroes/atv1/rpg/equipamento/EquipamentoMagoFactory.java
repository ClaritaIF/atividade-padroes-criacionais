package br.edu.ifpb.ads.padroes.atv1.rpg.equipamento;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Raca;

public class EquipamentoMagoFactory implements EquipamentoFactory {

    @Override
    public Arma criarArma(Raca raca) {
        return switch (raca) {
            case HUMANO -> new Arma("Cajado M\u00e1gico", 15, "Cajado");
            case ELFO -> new Arma("Cajado da Natureza", 18, "Cajado");
            case ORC -> new Arma("Cajado Tribal", 12, "Cajado");
        };
    }

    @Override
    public Armadura criarArmadura(Raca raca) {
        return switch (raca) {
            case HUMANO -> new Armadura("Vestes M\u00e1gicas", 8, "Leve");
            case ELFO -> new Armadura("Mantos \u00c9lficos", 10, "Leve");
            case ORC -> new Armadura("Vestes Xam\u00e2nicas", 6, "Leve");
        };
    }

}
