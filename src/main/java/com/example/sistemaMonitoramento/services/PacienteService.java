package com.example.sistemaMonitoramento.services;

import com.example.sistemaMonitoramento.entities.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private IPacienteRepository pacienteRepository;

    public List<Paciente> buscarTodos() {
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> buscarPorId(Integer id) {
        return pacienteRepository.findById(id);
    }

    public Paciente gravar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public Paciente atualizarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public void excluir(Integer id) {
        pacienteRepository.deleteById(id);
    }
}
