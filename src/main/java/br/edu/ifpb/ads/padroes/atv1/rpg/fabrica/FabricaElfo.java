package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica;

import br.edu.ifpb.ads.padroes.atv1.rpg.Atributos;
import br.edu.ifpb.ads.padroes.atv1.rpg.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Raca;

public class FabricaElfo extends FabricaPersonagem {

    @Override
    protected Raca getRaca() {
        return Raca.ELFO;
    }

    @Override
    protected Atributos criarAtributos(ClassePersonagem classe) {
        return switch (classe) {
            case GUERREIRO -> new Atributos(12, 14, 16, 100, 60);
            case MAGO -> new Atributos(4, 20, 14, 70, 180);
            case ARQUEIRO -> new Atributos(8, 16, 20, 90, 100);
        };
    }

    @Override
    protected String[] criarHabilidades(ClassePersonagem classe) {
        return switch (classe) {
            case GUERREIRO -> new String[]{"Dan\u00e7a das L\u00e2minas", "Agilidade \u00c9lfica"};
            case MAGO -> new String[]{"Magia da Natureza", "Teleporte"};
            case ARQUEIRO -> new String[]{"Tiro M\u00faltiplo", "Camuflagem"};
        };
    }

}
