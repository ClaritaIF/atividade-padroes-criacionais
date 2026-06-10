package br.edu.ifpb.ads.padroes.atv1.rpg;

import java.util.Arrays;

public enum ClassePersonagem {

    GUERREIRO("Guerreiro"),
    MAGO("Mago"),
    ARQUEIRO("Arqueiro");

    private final String nome;

    ClassePersonagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static ClassePersonagem de(String nome) {
        return Arrays.stream(values())
                .filter(classe -> classe.nome.equalsIgnoreCase(nome)
                        || classe.name().equalsIgnoreCase(nome))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Classe invalida: " + nome));
    }

}
