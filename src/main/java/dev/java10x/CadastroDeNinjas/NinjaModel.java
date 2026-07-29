package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

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
}



