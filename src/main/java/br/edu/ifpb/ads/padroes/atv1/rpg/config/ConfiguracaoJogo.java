package br.edu.ifpb.ads.padroes.atv1.rpg.config;

public class ConfiguracaoJogo {

    private static final ConfiguracaoJogo INSTANCIA = new ConfiguracaoJogo();

    private int nivelDificuldade;

    private ConfiguracaoJogo() {
        this.nivelDificuldade = 1;
    }

    public static ConfiguracaoJogo getInstancia() {
        return INSTANCIA;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivel) {
        this.nivelDificuldade = nivel;
    }

}
