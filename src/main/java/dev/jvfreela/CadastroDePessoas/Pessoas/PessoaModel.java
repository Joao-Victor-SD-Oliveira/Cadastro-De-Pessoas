package dev.jvfreela.CadastroDePessoas.Pessoas;

import jakarta.persistence.*;

@Entity
@Table (name = "tb_cadastro")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    public PessoaModel() {
    }

    public PessoaModel(String name, int idade, String email) {
        this.nome = name;
        this.idade = idade;
        this.email = email;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
