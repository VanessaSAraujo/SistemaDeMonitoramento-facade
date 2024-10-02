package com.example.sistemaMonitoramento.application;

import com.example.sistemaMonitoramento.entities.Clinica;
import com.example.sistemaMonitoramento.interfaces.IClinicaRepository;
import com.example.sistemaMonitoramento.repositories.ClinicaRepository;
import com.example.sistemaMonitoramento.services.ClinicaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClinicaApplication {

    private IClinicaRepository clinicaRepository;
    private ClinicaService clinicaService;


    public ClinicaApplication(IClinicaRepository clinicaRepository, ClinicaService clinicaService) {
        this.clinicaRepository = clinicaRepository;
        this.clinicaService = clinicaService;
    }

    public void adicionar(Clinica clinica) {
        this.clinicaRepository.adicionar(clinica);
    }

    public void remover(int id) {
        this.clinicaRepository.remover(id);

    }

    public Clinica buscarPorId(int id) {
        return this.clinicaRepository.buscarPorId(id);
    }

    public ArrayList<Clinica> buscarTodos() {
        return this.clinicaRepository.buscarTodos();
    }

    public void atualizarClinica(int id, Clinica clinica) {
        this.clinicaRepository.atualizarClinica(id, clinica);
    }
}
