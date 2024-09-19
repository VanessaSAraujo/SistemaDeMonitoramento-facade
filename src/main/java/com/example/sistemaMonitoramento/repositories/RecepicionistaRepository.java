package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.Medico;
import com.example.sistemaMonitoramento.entities.Recepcionista;
import com.example.sistemaMonitoramento.interfaces.IRecepcionistaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RecepicionistaRepository implements IRecepcionistaRepository {
    private EntityManager entityManager;

    @Autowired
    public RecepicionistaRepository (EntityManager entityManager){ this.entityManager = entityManager; }


    @Override
    @Transactional
    public void create(Recepcionista recepcionista) {
        this.entityManager.persist(recepcionista);
    }

    @Override
    public Recepcionista findById(Integer id) {
        return this.entityManager.find(Recepcionista.class, id);
    }

    @Override
    public List<Recepcionista> findAll() {
        return entityManager.createQuery("select s from Recepcionista s ORDER BY s. nome", Recepcionista.class).getResultList();
    }

    @Override
    public List<Recepcionista> findByName(String name) {
        TypedQuery<Recepcionista> query = entityManager
                .createQuery("select s from Recepcionista s WHERE s.firstName LIKE: name", Recepcionista.class);
        query.setParameter("name", "%" + name + "%");

        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(int id, Recepcionista recepcionista) {
        TypedQuery<Recepcionista> query = entityManager
                .createQuery("delete s from Student s WHERE s.id = :id", Recepcionista.class);
        query.setParameter("id", id);

        query.executeUpdate();
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        TypedQuery<Recepcionista> query = entityManager
                .createQuery("delete from Recepcionista s", Recepcionista.class);

        query.executeUpdate();
    }
}