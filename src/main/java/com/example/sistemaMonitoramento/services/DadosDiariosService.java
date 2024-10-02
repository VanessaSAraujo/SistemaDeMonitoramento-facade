package com.example.sistemaMonitoramento.services;

import com.example.sistemaMonitoramento.entities.DadosDiarios;
import com.example.sistemaMonitoramento.interfaces.IDadosDiariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DadosDiariosService {

    @Autowired
    private IDadosDiariosRepository dadosDiariosRepository;

    public void adicionarDadosDiarios(DadosDiarios dadosDiarios) {
        dadosDiariosRepository.adicionar(dadosDiarios);
    }

    public void removerDadosDiarios(int id) {
        dadosDiariosRepository.remover(id);
    }

    public DadosDiarios buscarDadosDiariosPorId(int id) {
        return dadosDiariosRepository.buscarPorId(id);
    }

    public List<DadosDiarios> buscarTodosDadosDiarios() {
        return dadosDiariosRepository.buscarTodos();
    }

    public void atualizarDadosDiarios(int id, DadosDiarios dadosDiarios) {
        dadosDiariosRepository.atualizarDadosDiarios(id, dadosDiarios);
    }
}