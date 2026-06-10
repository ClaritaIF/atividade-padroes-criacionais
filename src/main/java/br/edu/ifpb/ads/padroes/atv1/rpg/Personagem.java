package br.edu.ifpb.ads.padroes.atv1.rpg;

public class Personagem implements Prototipo<Personagem> {

    private String nome;
    private final String raca;
    private final String classe;
    private final int forca;
    private final int inteligencia;
    private final int agilidade;
    private final int vida;
    private final int mana;
    private final Arma arma;
    private final Armadura armadura;
    private final String[] habilidades;

    public Personagem(String nome, String raca, String classe, int forca,
                      int inteligencia, int agilidade, int vida, int mana,
                      Arma arma, Armadura armadura, String[] habilidades) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vida = vida;
        this.mana = mana;
        this.arma = arma;
        this.armadura = armadura;
        this.habilidades = habilidades.clone();
    }

    public Personagem(Personagem personagem) {
        this(personagem.nome, personagem.raca, personagem.classe,
                personagem.forca, personagem.inteligencia, personagem.agilidade,
                personagem.vida, personagem.mana,
                personagem.arma.copiar(), personagem.armadura.copiar(),
                personagem.habilidades);
    }

    // Mantem setNome para renomear clones criados pelo Prototype.
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getClasse() {
        return classe;
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

    public Arma getArma() {
        return arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public String[] getHabilidades() {
        return habilidades.clone();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Personagem copiar() {
        return new Personagem(this);
    }

    @Override
    public String toString() {
        return String.format("%s - %s %s (F:%d, I:%d, A:%d, V:%d, M:%d)",
                nome, raca, classe, forca, inteligencia, agilidade, vida, mana);
    }

}
