package com.example.sistemaMonitoramento.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "comorbidades")
public class Comorbidade {
    public Comorbidade (){

    }
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @OneToMany(mappedBy = "comorbidade")
    private List<Paciente> pacientes;

    public Comorbidade(int id, String nome, String descricao, List<Paciente> pacientes) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.pacientes = pacientes;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
}
