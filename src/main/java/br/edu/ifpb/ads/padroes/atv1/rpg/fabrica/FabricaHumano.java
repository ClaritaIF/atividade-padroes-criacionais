package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica;

import br.edu.ifpb.ads.padroes.atv1.rpg.Atributos;
import br.edu.ifpb.ads.padroes.atv1.rpg.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Raca;

public class FabricaHumano extends FabricaPersonagem {

    @Override
    protected Raca getRaca() {
        return Raca.HUMANO;
    }

    @Override
    protected Atributos criarAtributos(ClassePersonagem classe) {
        return switch (classe) {
            case GUERREIRO -> new Atributos(15, 8, 10, 120, 30);
            case MAGO -> new Atributos(6, 18, 8, 80, 150);
            case ARQUEIRO -> new Atributos(10, 12, 16, 100, 70);
        };
    }

    @Override
    protected String[] criarHabilidades(ClassePersonagem classe) {
        return switch (classe) {
            case GUERREIRO -> new String[]{"Investida", "Bloqueio"};
            case MAGO -> new String[]{"Bola de Fogo", "Cura"};
            case ARQUEIRO -> new String[]{"Tiro Certeiro", "Chuva de Flechas"};
        };
    }

}
