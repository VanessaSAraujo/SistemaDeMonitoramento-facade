package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.Comorbidade;
import com.example.sistemaMonitoramento.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IComorbidadeRepository {
    void create (Comorbidade comorbidade);

    Comorbidade findById(Integer id);

    List<Comorbidade> findAll();

    List<Comorbidade> findByName(String name);

    void update(int id, Comorbidade comorbidade);

    void deleteById(int id);
}
