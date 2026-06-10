package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica;

import br.edu.ifpb.ads.padroes.atv1.rpg.Atributos;
import br.edu.ifpb.ads.padroes.atv1.rpg.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Raca;

public class FabricaOrc extends FabricaPersonagem {

    @Override
    protected Raca getRaca() {
        return Raca.ORC;
    }

    @Override
    protected Atributos criarAtributos(ClassePersonagem classe) {
        return switch (classe) {
            case GUERREIRO -> new Atributos(20, 6, 8, 150, 20);
            case MAGO -> new Atributos(10, 14, 6, 100, 120);
            case ARQUEIRO -> new Atributos(14, 8, 12, 120, 40);
        };
    }

    @Override
    protected String[] criarHabilidades(ClassePersonagem classe) {
        return switch (classe) {
            case GUERREIRO -> new String[]{"F\u00faria", "Pancada Devastadora"};
            case MAGO -> new String[]{"Magia Sombria", "Invoca\u00e7\u00e3o"};
            case ARQUEIRO -> new String[]{"Tiro Brutal", "Intimida\u00e7\u00e3o"};
        };
    }

}
