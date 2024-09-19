package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.Medico;
import com.example.sistemaMonitoramento.entities.Paciente;
import com.example.sistemaMonitoramento.interfaces.IPacienteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PacienteRepository implements IPacienteRepository {
    private EntityManager entityManager;

    @Autowired
    public PacienteRepository (EntityManager entityManager){ this.entityManager = entityManager; }


    @Override
    @Transactional
    public void create(Paciente paciente) {
        this.entityManager.persist(paciente);
    }

    @Override
    public Paciente findById(Integer id) {
        return this.entityManager.find(Paciente.class, id);
    }

    @Override
    public List<Paciente> findAll() {
        return entityManager.createQuery("select s from Paciente s ORDER BY s. nome", Paciente.class).getResultList();
    }

    @Override
    public List<Paciente> findByName(String name) {
        TypedQuery<Paciente> query = entityManager
                .createQuery("select s from Student s WHERE s.firstName LIKE: name", Paciente.class);
        query.setParameter("name", "%" + name + "%");

        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(int id, Paciente paciente) {
        TypedQuery<Paciente> query = entityManager
                .createQuery("delete s from Paciente s WHERE s.id = :id", Paciente.class);
        query.setParameter("id", id);

        query.executeUpdate();
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        TypedQuery<Paciente> query = entityManager
                .createQuery("delete from Paciente s", Paciente.class);

        query.executeUpdate();
    }
}