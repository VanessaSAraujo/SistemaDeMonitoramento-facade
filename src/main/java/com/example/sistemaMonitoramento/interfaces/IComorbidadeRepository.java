package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.Comorbidade;

import java.util.ArrayList;

public interface IComorbidadeRepository {
    void adicionar(Comorbidade comorbidade);

    void remover(int id);

    Comorbidade buscarPorId(int id);

    ArrayList<Comorbidade> buscarTodos();

    void atualizarComorbidade(int id, Comorbidade comorbidade);
}
