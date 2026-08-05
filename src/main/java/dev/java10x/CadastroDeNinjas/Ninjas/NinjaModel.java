package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity ele transforma uma classe me uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id // atributo logo abaixo vai ser o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estrategia de como vai ser gerado o ID

    @Column (name ="id")
    private Long id;

    @Column (name ="nome")
    private String nome;

    @Column (name ="img_url")
    private String img_url;

    @Column(unique = true)
    private String email;

    @Column (name ="idade")
    private int idade;

    // @ManyToOne - um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing key ou chave estrangeira vai dar informacoes das 2 tabelas
    private MissoesModel missoes;




}
