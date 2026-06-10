package br.edu.ifpb.ads.padroes.atv1.rpg;

public class CriadorPersonagem {

    private CriadorPersonagem() {
    }

    public static Personagem criarPersonagem(String nome, String raca, String classe) {
        try {
            Raca racaPersonagem = Raca.de(raca);
            ClassePersonagem classePersonagem = ClassePersonagem.de(classe);

            return RegistroPrototiposPersonagem.getInstancia()
                    .criar(nome, racaPersonagem, classePersonagem);
        } catch (IllegalArgumentException ex) {
            System.out.println("Combina\u00e7\u00e3o inv\u00e1lida: " + raca + " " + classe);
            return null;
        }
    }

    public static Personagem criarPersonagemEspecial(String nome, String raca, String classe) {
        Personagem base = criarPersonagem(nome, raca, classe);
        if (base == null) {
            return null;
        }

        if (Raca.HUMANO.equals(Raca.de(raca)) && ClassePersonagem.GUERREIRO.equals(ClassePersonagem.de(classe))) {
            return PersonagemBuilder.aPartirDe(base)
                    .comNome(nome + " o Lend\u00e1rio")
                    .comAtributos(new Atributos(18, 10, 12, 140, 40))
                    .comArma(new Arma("Excalibur", 35, "Espada"))
                    .comArmadura(new Armadura("Armadura do Rei", 30, "Pesada"))
                    .comHabilidades("Investida", "Bloqueio", "Lideran\u00e7a")
                    .construir();
        }

        return base;
    }

}
