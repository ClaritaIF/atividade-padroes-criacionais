package br.edu.ifpb.ads.padroes.atv1.rpg.equipamento;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Raca;

public interface EquipamentoFactory {

    Arma criarArma(Raca raca);

    Armadura criarArmadura(Raca raca);

}
