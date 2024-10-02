package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.DadosDiarios;

import java.util.ArrayList;

public interface IDadosDiariosRepository {

    void adicionar(DadosDiarios dados);

    void remover(int id);

    DadosDiarios buscarPorId(int id);

    ArrayList<DadosDiarios> buscarTodos();

    void atualizarDadosDiarios(int id, DadosDiarios dados);
}
