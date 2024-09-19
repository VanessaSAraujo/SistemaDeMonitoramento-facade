package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.Medico;
import com.example.sistemaMonitoramento.entities.Recepcionista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRecepcionistaRepository {

    void create (Recepcionista recepcionista);

    Recepcionista findById(Integer id);

    List<Recepcionista> findAll();

    List<Recepcionista> findByName(String name);

    void update(int id, Recepcionista recepcionista);

    void deleteById(int id);



}

