package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.Clinica;
import jakarta.transaction.Transactional;

import java.util.List;

public interface IClinicaRepository {

    @Transactional
    void create(Clinica clinica);

    Clinica findById(Integer id);

    List<Clinica> findAll();

    List<Clinica> findByName(String name);

    @Transactional
    void update(int id, Clinica clinica);

    @Transactional
    void deleteById(int id);
}
