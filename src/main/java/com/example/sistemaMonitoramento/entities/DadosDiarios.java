package com.example.sistemaMonitoramento.entities;

import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "dadosdiarios")
public class DadosDiarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_paciente", nullable = false)
    private Paciente paciente;

    @Column(name = "data", nullable = false)
    private Date data;

    @Column(name = "horario_medicacao")
    private String horarioMedicacao;

    @Column(name = "descricao_dia", nullable = true)
    private String descricaoDia;

    @Column(name = "desconforto", nullable = true)
    private String desconforto;

    @Column(name = "outras_medicacoes", nullable = true)
    private String outrasMedicacoes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorarioMedicacao() {
        return horarioMedicacao;
    }

    public void setHorarioMedicacao(String horarioMedicacao) {
        this.horarioMedicacao = horarioMedicacao;
    }

    public String getDescricaoDia() {
        return descricaoDia;
    }

    public void setDescricaoDia(String descricaoDia) {
        this.descricaoDia = descricaoDia;
    }

    public String getDesconforto() {
        return desconforto;
    }

    public void setDesconforto(String desconforto) {
        this.desconforto = desconforto;
    }

    public String getOutrasMedicacoes() {
        return outrasMedicacoes;
    }

    public void setOutrasMedicacoes(String outrasMedicacoes) {
        this.outrasMedicacoes = outrasMedicacoes;
    }
}
