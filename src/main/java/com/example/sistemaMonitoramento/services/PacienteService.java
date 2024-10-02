package com.example.sistemaMonitoramento.services;

import com.example.sistemaMonitoramento.entities.Paciente;
import com.example.sistemaMonitoramento.interfaces.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private IPacienteRepository pacienteRepository;

    public void adicionarPaciente(Paciente paciente) {
        pacienteRepository.adicionar(paciente);
    }

    public void removerPaciente(int id) {
        pacienteRepository.remover(id);
    }

    public Paciente buscarPacientePorId(int id) {
        return pacienteRepository.buscarPorId(id);
    }

    public List<Paciente> buscarTodosPacientes() {
        return pacienteRepository.buscarTodos();
    }

    public void atualizarPaciente(int id, Paciente paciente) {
        pacienteRepository.atualizarPaciente(id, paciente);
    }
}