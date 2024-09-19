package com.example.sistemaMonitoramento.facade;

import com.example.sistemaMonitoramento.entities.Comorbidade;
import com.example.sistemaMonitoramento.entities.DadosDiarios;
import com.example.sistemaMonitoramento.entities.ObservacoesMedicas;
import com.example.sistemaMonitoramento.entities.Paciente;
import com.example.sistemaMonitoramento.repositories.ComorbidadeRepository;
import com.example.sistemaMonitoramento.repositories.DadosDiariosRepository;
import com.example.sistemaMonitoramento.repositories.ObservacoesMedicasRepository;
import com.example.sistemaMonitoramento.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InfoPacienteFacade {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private ComorbidadeRepository comorbidadeRepository;

    @Autowired
    private DadosDiariosRepository dadosDiariosRepository;

    @Autowired
    private ObservacoesMedicasRepository observacoesMedicasRepository;

    // CRUD Paciente
    public void createPaciente(Paciente paciente) {
        pacienteRepository.create(paciente);
    }

    public Paciente findPacienteById(int id) {
        return pacienteRepository.findById(id);
    }

    public List<Paciente> findAllPacientes() {
        return pacienteRepository.findAll();
    }

    public void updatePaciente(int id, Paciente paciente) {
        pacienteRepository.update(id, paciente);
    }

    public void deletePacienteById(int id) {
        pacienteRepository.deleteById(id);
    }

    // CRUD Comorbidade
    public void createComorbidade(Comorbidade comorbidade) {
        comorbidadeRepository.create(comorbidade);
    }

    public Comorbidade findComorbidadeById(int id) {
        return comorbidadeRepository.findById(id);
    }

    public List<Comorbidade> findAllComorbidades() {
        return comorbidadeRepository.findAll();
    }

    public void updateComorbidade(int id, Comorbidade comorbidade) {
        comorbidadeRepository.update(id, comorbidade);
    }

    public void deleteComorbidadeById(int id) {
        comorbidadeRepository.deleteById(id);
    }

    // CRUD DadosDiarios
    public void createDadosDiarios(DadosDiarios dadosDiarios) {
        dadosDiariosRepository.create(dadosDiarios);
    }

    public DadosDiarios findDadosDiariosById(int id) {
        return dadosDiariosRepository.findById(id);
    }

    public List<DadosDiarios> findAllDadosDiarios() {
        return dadosDiariosRepository.findAll();
    }

    public void updateDadosDiarios(int id, DadosDiarios dadosDiarios) {
        dadosDiariosRepository.update(id, dadosDiarios);
    }

    public void deleteDadosDiariosById(int id) {
        dadosDiariosRepository.deleteById(id);
    }

    // CRUD ObservacoesMedicas
    public void createObservacoesMedicas(ObservacoesMedicas observacoesMedicas) {
        observacoesMedicasRepository.create(observacoesMedicas);
    }

    public ObservacoesMedicas findObservacoesMedicasById(int id) {
        return observacoesMedicasRepository.findById(id);
    }

    public List<ObservacoesMedicas> findAllObservacoesMedicas() {
        return observacoesMedicasRepository.findAll();
    }

    public void updateObservacoesMedicas(int id, ObservacoesMedicas observacoesMedicas) {
        observacoesMedicasRepository.update(id, observacoesMedicas);
    }

    public void deleteObservacoesMedicasById(int id) {
        observacoesMedicasRepository.deleteById(id);
    }
}
