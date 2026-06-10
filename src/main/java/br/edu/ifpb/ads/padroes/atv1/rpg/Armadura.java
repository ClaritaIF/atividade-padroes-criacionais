package br.edu.ifpb.ads.padroes.atv1.rpg;

public class Armadura implements Prototipo<Armadura> {

    private final String nome;
    private final int defesa;
    private final String tipo;

    public Armadura(String nome, int defesa, String tipo) {
        this.nome = nome;
        this.defesa = defesa;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getDefesa() {
        return defesa;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public Armadura copiar() {
        return new Armadura(nome, defesa, tipo);
    }

}
