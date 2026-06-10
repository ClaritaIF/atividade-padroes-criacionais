package br.edu.ifpb.ads.padroes.atv1.rpg.equipamento;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Raca;

public class EquipamentoGuerreiroFactory implements EquipamentoFactory {

    @Override
    public Arma criarArma(Raca raca) {
        return switch (raca) {
            case HUMANO -> new Arma("Espada de Ferro", 25, "Espada");
            case ELFO -> new Arma("L\u00e2mina \u00c9lfica", 22, "Espada");
            case ORC -> new Arma("Machado de Guerra", 30, "Machado");
        };
    }

    @Override
    public Armadura criarArmadura(Raca raca) {
        return switch (raca) {
            case HUMANO -> new Armadura("Armadura de Placas", 20, "Pesada");
            case ELFO -> new Armadura("Cota de Malha \u00c9lfica", 15, "M\u00e9dia");
            case ORC -> new Armadura("Armadura Brutal", 25, "Pesada");
        };
    }

}
