package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.Medico;
import com.example.sistemaMonitoramento.entities.Paciente;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPacienteRepository {

    void create (Paciente paciente);

    Paciente findById(Integer id);

    List<Paciente> findAll();

    List<Paciente> findByName(String name);

    void update(int id, Paciente paciente);

    void deleteById(int id);

}
