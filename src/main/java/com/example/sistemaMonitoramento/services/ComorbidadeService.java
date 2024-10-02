package com.example.sistemaMonitoramento.services;

import com.example.sistemaMonitoramento.entities.Comorbidade;
import com.example.sistemaMonitoramento.interfaces.IComorbidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComorbidadeService {

    @Autowired
    private IComorbidadeRepository comorbidadeRepository;

    public void adicionarComorbidades(Comorbidade comorbidade) {
        comorbidadeRepository.adicionar(comorbidade);
    }

    public void removerComorbidades(int id) {
        comorbidadeRepository.remover(id);
    }

    public Comorbidade buscarComorbidadePorId(int id) {
        return comorbidadeRepository.buscarPorId(id);
    }

    public List<Comorbidade> buscarTodosComorbidades() {
        return comorbidadeRepository.buscarTodos();
    }

    public void atualizarComorbidades(int id, Comorbidade comorbidades) {
        comorbidadeRepository.atualizarComorbidade(id, comorbidades);
    }
}
