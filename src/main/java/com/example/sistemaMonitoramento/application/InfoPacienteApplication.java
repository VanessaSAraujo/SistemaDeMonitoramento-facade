package com.example.sistemaMonitoramento.application;

import com.example.sistemaMonitoramento.entities.Paciente;
import com.example.sistemaMonitoramento.entities.Comorbidade;
import com.example.sistemaMonitoramento.repositories.PacienteRepository;
import com.example.sistemaMonitoramento.repositories.ComorbidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoPacienteApplication {
    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private ComorbidadeRepository comorbidadeRepository;


    public void createPaciente(Paciente paciente) {
        pacienteRepository.create(paciente);
    }

    public Paciente findPacienteById(Integer id) {
        return pacienteRepository.findById(id);
    }

    public List<Paciente> findAllPacientes() {
        return pacienteRepository.findAll();
    }

    public void updatePaciente(Integer id, Paciente paciente) {
        pacienteRepository.update(id, paciente);
    }

    public void deletePacienteById(Integer id) {
        pacienteRepository.deleteById(id);
    }


    public void createComorbidade(Comorbidade comorbidade) {
        comorbidadeRepository.create(comorbidade);
    }

    public Comorbidade findComorbidadeById(Integer id) {
        return comorbidadeRepository.findById(id);
    }

    public List<Comorbidade> findAllComorbidades() {
        return comorbidadeRepository.findAll();
    }

    public void updateComorbidade(Integer id, Comorbidade comorbidade) {
        comorbidadeRepository.update(id, comorbidade);
    }

    public void deleteComorbidadeById(Integer id) {
        comorbidadeRepository.deleteById(id);
    }
}
