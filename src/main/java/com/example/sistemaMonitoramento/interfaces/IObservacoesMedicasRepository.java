package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.ObservacoesMedicas;

import java.util.ArrayList;

public interface IObservacoesMedicasRepository {
    void adicionar(ObservacoesMedicas observacao);

    void remover(int id);

    ObservacoesMedicas buscarPorId(int id);

    ArrayList<ObservacoesMedicas> buscarTodos();

    void atualizarObservacao(int id, ObservacoesMedicas observacao);
}
