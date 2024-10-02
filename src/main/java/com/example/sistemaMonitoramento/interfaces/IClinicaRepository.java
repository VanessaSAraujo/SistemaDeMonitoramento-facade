package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.Clinica;

import java.util.ArrayList;

public interface IClinicaRepository {
    void adicionar(Clinica clinica);

    void remover(int id);

    Clinica buscarPorId(int id);

    ArrayList<Clinica> buscarTodos();

    void atualizarClinica(int id, Clinica clinica);
}
