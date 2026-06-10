package br.edu.ifpb.ads.padroes.atv1.rpg;

import java.util.Arrays;

public enum Raca {

    HUMANO("Humano"),
    ELFO("Elfo"),
    ORC("Orc");

    private final String nome;

    Raca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static Raca de(String nome) {
        return Arrays.stream(values())
                .filter(raca -> raca.nome.equalsIgnoreCase(nome)
                        || raca.name().equalsIgnoreCase(nome))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Raca invalida: " + nome));
    }

}
