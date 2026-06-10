package br.edu.ifpb.ads.padroes.atv1.rpg;

public class Atributos {

    private final int forca;
    private final int inteligencia;
    private final int agilidade;
    private final int vida;
    private final int mana;

    public Atributos(int forca, int inteligencia, int agilidade, int vida, int mana) {
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vida = vida;
        this.mana = mana;
    }

    public int getForca() {
        return forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

}
