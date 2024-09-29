package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.Paciente;

import java.util.ArrayList;

public interface IPacienteRepository {

    void adicionar(Paciente paciente);

    void remover(int id);

    Paciente buscarPorId(int id);

    ArrayList<Paciente> buscarTodos();

    void atualizarPaciente(int id, Paciente paciente);

}
