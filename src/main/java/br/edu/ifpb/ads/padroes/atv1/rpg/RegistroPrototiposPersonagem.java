package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.fabrica.FabricaPersonagemProvider;
import java.util.EnumMap;
import java.util.Map;

public class RegistroPrototiposPersonagem {

    private static final RegistroPrototiposPersonagem INSTANCIA = new RegistroPrototiposPersonagem();

    private final Map<Raca, Map<ClassePersonagem, Personagem>> prototipos;

    private RegistroPrototiposPersonagem() {
        this.prototipos = new EnumMap<>(Raca.class);
        carregarPrototipos();
    }

    public static RegistroPrototiposPersonagem getInstancia() {
        return INSTANCIA;
    }

    public Personagem criar(String nome, Raca raca, ClassePersonagem classe) {
        Personagem prototipo = prototipos.get(raca).get(classe);
        Personagem personagem = prototipo.copiar();
        personagem.setNome(nome);
        return personagem;
    }

    private void carregarPrototipos() {
        for (Raca raca : Raca.values()) {
            Map<ClassePersonagem, Personagem> porClasse = new EnumMap<>(ClassePersonagem.class);
            for (ClassePersonagem classe : ClassePersonagem.values()) {
                porClasse.put(classe, FabricaPersonagemProvider.para(raca)
                        .criarPersonagem("Prototipo", classe));
            }
            prototipos.put(raca, porClasse);
        }
    }

}
