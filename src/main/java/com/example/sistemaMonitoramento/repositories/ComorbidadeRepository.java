package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.Comorbidade;
import com.example.sistemaMonitoramento.entities.Medico;
import com.example.sistemaMonitoramento.interfaces.IComorbidadeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ComorbidadeRepository implements IComorbidadeRepository {
    private EntityManager entityManager;

    @Autowired
    public ComorbidadeRepository (EntityManager entityManager){ this.entityManager = entityManager; }


    @Override
    @Transactional
    public void create(Comorbidade comorbidade) {
        this.entityManager.persist(comorbidade);
    }

    @Override
    public Comorbidade findById(Integer id) {
        return this.entityManager.find(Comorbidade.class, id);
    }

    @Override
    public List<Comorbidade> findAll() {
        return entityManager.createQuery("select s from Comorbidade s ORDER BY s. nome", Comorbidade.class).getResultList();
    }

    @Override
    public List<Comorbidade> findByName(String name) {
        TypedQuery<Comorbidade> query = entityManager
                .createQuery("select s from Student s WHERE s.firstName LIKE: name", Comorbidade.class);
        query.setParameter("name", "%" + name + "%");

        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(int id, Comorbidade comorbidade) {
        TypedQuery<Comorbidade> query = entityManager
                .createQuery("delete s from Comorbidade s WHERE s.id = :id", Comorbidade.class);
        query.setParameter("id", id);

        query.executeUpdate();
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        TypedQuery<Comorbidade> query = entityManager
                .createQuery("delete from Comorbidade s", Comorbidade.class);

        query.executeUpdate();
    }
}