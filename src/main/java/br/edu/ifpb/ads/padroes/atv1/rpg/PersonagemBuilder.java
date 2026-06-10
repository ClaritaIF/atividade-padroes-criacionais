package br.edu.ifpb.ads.padroes.atv1.rpg;

import java.util.Objects;

public class PersonagemBuilder {

    private String nome;
    private Raca raca;
    private ClassePersonagem classe;
    private Atributos atributos;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public static PersonagemBuilder novo() {
        return new PersonagemBuilder();
    }

    public static PersonagemBuilder aPartirDe(Personagem personagem) {
        return novo()
                .comNome(personagem.getNome())
                .comRaca(Raca.de(personagem.getRaca()))
                .comClasse(ClassePersonagem.de(personagem.getClasse()))
                .comAtributos(new Atributos(personagem.getForca(), personagem.getInteligencia(),
                        personagem.getAgilidade(), personagem.getVida(), personagem.getMana()))
                .comArma(personagem.getArma())
                .comArmadura(personagem.getArmadura())
                .comHabilidades(personagem.getHabilidades());
    }

    public PersonagemBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public PersonagemBuilder comRaca(Raca raca) {
        this.raca = raca;
        return this;
    }

    public PersonagemBuilder comClasse(ClassePersonagem classe) {
        this.classe = classe;
        return this;
    }

    public PersonagemBuilder comAtributos(Atributos atributos) {
        this.atributos = atributos;
        return this;
    }

    public PersonagemBuilder comArma(Arma arma) {
        this.arma = arma;
        return this;
    }

    public PersonagemBuilder comArmadura(Armadura armadura) {
        this.armadura = armadura;
        return this;
    }

    public PersonagemBuilder comHabilidades(String... habilidades) {
        this.habilidades = habilidades.clone();
        return this;
    }

    public Personagem construir() {
        Objects.requireNonNull(nome, "nome deve ser informado");
        Objects.requireNonNull(raca, "raca deve ser informada");
        Objects.requireNonNull(classe, "classe deve ser informada");
        Objects.requireNonNull(atributos, "atributos devem ser informados");
        Objects.requireNonNull(arma, "arma deve ser informada");
        Objects.requireNonNull(armadura, "armadura deve ser informada");
        Objects.requireNonNull(habilidades, "habilidades devem ser informadas");

        return new Personagem(nome, raca.getNome(), classe.getNome(),
                atributos.getForca(), atributos.getInteligencia(), atributos.getAgilidade(),
                atributos.getVida(), atributos.getMana(),
                arma.copiar(), armadura.copiar(), habilidades);
    }

}
