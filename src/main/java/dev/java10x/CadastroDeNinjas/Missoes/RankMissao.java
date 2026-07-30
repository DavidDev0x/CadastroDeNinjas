package dev.java10x.CadastroDeNinjas.Missoes;

public enum RankMissao {
    D("Missao basica e risco quase nulo", 0),
    C("Missao iniciante porem, com um risco baixo",2),
    B("Missao intermediária com riscos moderados",4),
    A("Missao Avancada com riscos altos",5),
    S("Missao especial com riscos altissimos ",12);

    private String descricao;
    private int dificuldade;

    RankMissao() {
    }
    RankMissao(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

}

