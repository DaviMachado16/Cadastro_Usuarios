package br.com.cadastrousuario.projeto.model;

import jakarta.persistence.*;

//Entity = Cria uma representação da tabela usuarios do banco Postegres no codigo
@Entity
//Table = Cria uam conexão com a tabela usuarios do banco
@Table(name = "usuarios")
//CRIANDO ATRIBUTOS PARA O NOSSO USUARIO

public class Usuario {

    //Definimos nossa Primary Key
    @Id

    // Para criar um autoincremento do ID automático
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Nome das colunas
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", length = 200, nullable = true)
    private String nome;

    @Column(name = "email", length = 100, nullable = true)
    private String email;

    @Column(name = "senha", length = 50, nullable = true)
    private String senha;

    @Column(name = "telefone", length = 20)
    private String telefone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

