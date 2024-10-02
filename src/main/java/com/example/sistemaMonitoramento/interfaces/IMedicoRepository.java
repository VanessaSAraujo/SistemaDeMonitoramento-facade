package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.Medico;

import java.util.ArrayList;

public interface IMedicoRepository {

    void adicionar(Medico medico);

    void remover(int id);

    Medico buscarPorId(int id);

    ArrayList<Medico> buscarTodos();

    void atualizarMedico(int id, Medico medico);


}
