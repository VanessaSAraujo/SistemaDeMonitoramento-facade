package com.example.sistemaMonitoramento.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "medicos")
public class Medico {

    public Medico{

    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "especialidade", nullable = false)
    private String especialidade;

    @Column(name = "contato")
    private String contato;

    @ManyToOne
    @JoinColumn(name = "id_clinica", nullable = false)
    private Clinica clinica;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "crm")
    private String crm;

    public Medico(Integer id, String nome, String especialidade, String contato, Clinica clinica, String email, String senha, String crm) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.contato = contato;
        this.clinica = clinica;
        this.email = email;
        this.senha = senha;
        this.crm = crm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
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

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
