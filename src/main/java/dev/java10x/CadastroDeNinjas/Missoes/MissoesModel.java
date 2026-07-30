package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeMissao;

    private String dificuldade;

    private RankMissao rankMissao;

    // OneToMany - Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel>  ninja;

    public MissoesModel() {
    }

    public MissoesModel(long id, String nomeMissao, String dificuldade, RankMissao rankMissao, List<NinjaModel> ninja) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
        this.rankMissao = rankMissao;
        this.ninja = ninja;
    }


    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public RankMissao getRankMissao() {
        return rankMissao;
    }

    public void setRankMissao(RankMissao rankMissao) {
        this.rankMissao = rankMissao;
    }

    public List<NinjaModel> getNinja() {
        return ninja;
    }

    public void setNinja(List<NinjaModel> ninja) {
        this.ninja = ninja;
    }

    public long getId() {
        return id;
    }
}
