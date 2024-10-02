package com.example.sistemaMonitoramento.application;

import com.example.sistemaMonitoramento.entities.DadosDiarios;
import com.example.sistemaMonitoramento.interfaces.IDadosDiariosRepository;
import com.example.sistemaMonitoramento.services.DadosDiariosService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DadosDiariosApplication {

    private IDadosDiariosRepository dadosDiariosRepository;
    private DadosDiariosService dadosDiariosService;

    public DadosDiariosApplication(IDadosDiariosRepository dadosDiariosRepository, DadosDiariosService dadosDiariosService) {
        this.dadosDiariosRepository = dadosDiariosRepository;
        this.dadosDiariosService = dadosDiariosService;
    }

    public void adicionar(DadosDiarios dadosDiarios) {
        this.dadosDiariosRepository.adicionar(dadosDiarios);
    }

    public void remover(int id) {
        this.dadosDiariosRepository.remover(id);
    }

    public DadosDiarios buscarPorId(int id) {
        return this.dadosDiariosRepository.buscarPorId(id);
    }

    public ArrayList<DadosDiarios> buscarTodos() {
        return this.dadosDiariosRepository.buscarTodos();
    }

    public void atualizarDadosDiarios(int id, DadosDiarios dadosDiarios) {
        this.dadosDiariosRepository.atualizarDadosDiarios(id, dadosDiarios);
    }
}