package br.edu.ifpb.ads.padroes.atv1.rpg.fabrica;

import br.edu.ifpb.ads.padroes.atv1.rpg.Atributos;
import br.edu.ifpb.ads.padroes.atv1.rpg.ClassePersonagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.Raca;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.EquipamentoFactories;
import br.edu.ifpb.ads.padroes.atv1.rpg.equipamento.EquipamentoFactory;

public abstract class FabricaPersonagem {

    public final Personagem criarPersonagem(String nome, ClassePersonagem classe) {
        Raca raca = getRaca();
        EquipamentoFactory equipamentoFactory = EquipamentoFactories.para(classe);

        return PersonagemBuilder.novo()
                .comNome(nome)
                .comRaca(raca)
                .comClasse(classe)
                .comAtributos(criarAtributos(classe))
                .comArma(equipamentoFactory.criarArma(raca))
                .comArmadura(equipamentoFactory.criarArmadura(raca))
                .comHabilidades(criarHabilidades(classe))
                .construir();
    }

    protected abstract Raca getRaca();

    protected abstract Atributos criarAtributos(ClassePersonagem classe);

    protected abstract String[] criarHabilidades(ClassePersonagem classe);

}
