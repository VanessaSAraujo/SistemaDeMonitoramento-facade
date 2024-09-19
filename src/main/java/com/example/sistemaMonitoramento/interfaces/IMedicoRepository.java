package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.Medico;

import java.util.List;

public interface IMedicoRepository {

    void create (Medico medico);

    Medico findById(Integer id);

    List<Medico> findAll();

    List<Medico> findByName(String name);

    void update(int id, Medico medico);

    void deleteById(int id);



}
