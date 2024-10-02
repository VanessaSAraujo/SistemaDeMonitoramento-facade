package com.example.sistemaMonitoramento.facade;

import com.example.sistemaMonitoramento.application.ClinicaApplication;
import com.example.sistemaMonitoramento.entities.Clinica;
import com.example.sistemaMonitoramento.entities.Recepcionista;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClinicaFacade {
    private final ClinicaApplication clinicaApplication;

    public ClinicaFacade(ClinicaApplication clinicaApplication) {
        this.clinicaApplication = clinicaApplication;
    }

    public void adicionar(Clinica clinica) {
        this.clinicaApplication.adicionar(clinica);
    }

    public void remover(int id) {
        this.clinicaApplication.remover(id);
    }

    public Clinica buscarPorId(int id) {
        return this.clinicaApplication.buscarPorId(id);
    }

    public List<Clinica> buscarTodos() {
        return this.clinicaApplication.buscarTodos();
    }

    public void AtualizarClinica(int id, Clinica clinica) {
        this.clinicaApplication.atualizarClinica(id, clinica);
    }
}