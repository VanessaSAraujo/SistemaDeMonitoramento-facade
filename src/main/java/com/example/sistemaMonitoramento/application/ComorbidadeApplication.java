package com.example.sistemaMonitoramento.application;

import com.example.sistemaMonitoramento.entities.Comorbidade;
import com.example.sistemaMonitoramento.interfaces.IComorbidadeRepository;
import com.example.sistemaMonitoramento.services.ComorbidadeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ComorbidadeApplication {

    private IComorbidadeRepository comorbidadeRepository;
    private ComorbidadeService comorbidadeService;

    public ComorbidadeApplication(IComorbidadeRepository comorbidadesRepository, ComorbidadeService comorbidadeService) {
        this.comorbidadeRepository = comorbidadesRepository;
        this.comorbidadeService = comorbidadeService;
    }

    public void adicionar(Comorbidade comorbidades) {
        this.comorbidadeRepository.adicionar(comorbidades);
    }

    public void remover(int id) {
        this.comorbidadeRepository.remover(id);
    }

    public Comorbidade buscarPorId(int id) {
        return this.comorbidadeRepository.buscarPorId(id);
    }

    public ArrayList<Comorbidade> buscarTodos() {
        return this.comorbidadeRepository.buscarTodos();
    }

    public void atualizarComorbidade(int id, Comorbidade comorbidade) {
        this.comorbidadeRepository.atualizarComorbidade(id, comorbidade);
    }
}
