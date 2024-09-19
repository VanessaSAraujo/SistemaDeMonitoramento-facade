package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.Clinica;
import com.example.sistemaMonitoramento.interfaces.IClinicaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClinicaRepository implements IClinicaRepository {
    private EntityManager entityManager;

    @Autowired
    public ClinicaRepository (EntityManager entityManager){ this.entityManager = entityManager; }


    @Override
    @Transactional
    public void create(Clinica clinica) {
        this.entityManager.persist(clinica);
    }

    @Override
    public Clinica findById(Integer id) {
        return this.entityManager.find(Clinica.class, id);
    }

    @Override
    public List<Clinica> findAll() {
        return entityManager.createQuery("select s from ClinicaRepository s ORDER BY s. nome", Clinica.class).getResultList();
    }

    @Override
    public List<Clinica> findByName(String name) {
        TypedQuery<Clinica> query = entityManager
                .createQuery("select s from Clinica s WHERE s.firstName LIKE: name", Clinica.class);
        query.setParameter("name", "%" + name + "%");

        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(int id, Clinica clinica) {
        Clinica clinicaInDb = this.entityManager.find(Clinica.class, id);

        clinicaInDb.setNome(clinica.getNome());
        clinicaInDb.setEndereco(clinica.getEndereco());
        clinicaInDb.setMedicos(clinica.getMedicos());
        clinicaInDb.setTelefone(clinica.getTelefone());
        clinicaInDb.setPacientes(clinica.getPacientes());

        this.entityManager.merge(clinicaInDb);

    }

    @Override
    @Transactional
    public void deleteById(int id) {
        TypedQuery<Clinica> query = entityManager
                .createQuery("delete from ClinicaRepository s", Clinica.class);

        query.executeUpdate();
    }
}

