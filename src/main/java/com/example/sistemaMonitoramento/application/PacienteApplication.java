package com.example.sistemaMonitoramento.application;

import com.example.sistemaMonitoramento.entities.Paciente;
import com.example.sistemaMonitoramento.interfaces.IPacienteRepository;
import com.example.sistemaMonitoramento.services.PacienteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PacienteApplication {

    private IPacienteRepository pacienteRepository;
    private PacienteService pacienteService;

    public PacienteApplication(IPacienteRepository pacienteRepository, PacienteService pacienteService) {
        this.pacienteRepository = pacienteRepository;
        this.pacienteService = pacienteService;
    }

    public void adicionar(Paciente paciente) {
        this.pacienteRepository.adicionar(paciente);
    }

    public void remover(int id) {
        this.pacienteRepository.remover(id);
    }

    public Paciente buscarPorId(int id) {
        return this.pacienteRepository.buscarPorId(id);
    }

    public ArrayList<Paciente> buscarTodos() {
        return this.pacienteRepository.buscarTodos();
    }

    public void atualizarPaciente(int id, Paciente paciente) {
        this.pacienteRepository.atualizarPaciente(id, paciente);
    }
}