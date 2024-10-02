package com.example.sistemaMonitoramento.services;

import com.example.sistemaMonitoramento.entities.Clinica;
import com.example.sistemaMonitoramento.entities.Recepcionista;
import com.example.sistemaMonitoramento.interfaces.IClinicaRepository;
import com.example.sistemaMonitoramento.repositories.ClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

@Service
public class ClinicaService {

    @Autowired
    private IClinicaRepository clinicaRepository;

    public void adicionarClinica(Clinica clinica) {
        clinicaRepository.adicionar(new Clinica());
    }

    public void removerClinica(int id) {
        clinicaRepository.remover(id);
    }

    public Clinica buscarClinicaPorId(int id) {
        return clinicaRepository.buscarPorId(id);
    }

    public List<Clinica> buscarTodosClinicas() {
        return clinicaRepository.buscarTodos();
    }

    public void atualizarClinica(int id, Clinica clinica) {
        clinicaRepository.atualizarClinica(id, clinica);
    }
}