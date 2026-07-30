package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

// Entity ele transforma uma classe me uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id // atributo logo abaixo vai ser o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estrategia de como vai ser gerado o ID
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne - um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing key ou chave estrangeira vai dar informacoes das 2 tabelas
    private MissoesModel missoes;


    public NinjaModel() {

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }
}



