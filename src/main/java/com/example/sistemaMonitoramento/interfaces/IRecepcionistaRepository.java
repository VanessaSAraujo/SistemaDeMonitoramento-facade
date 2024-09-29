package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.Recepcionista;

import java.util.ArrayList;

public interface IRecepcionistaRepository {
    void adicionar(Recepcionista recepcionista);

    void remover(int id);

    Recepcionista buscarPorId(int id);

    ArrayList<Recepcionista> buscarTodos();

    void atualizarRecepcionista(int id, Recepcionista recepcionista);
}
