package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.ObservacoesMedicas;
import com.example.sistemaMonitoramento.interfaces.IObservacoesMedicasRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ObservacoesMedicasRepository implements IObservacoesMedicasRepository {
        private EntityManager entityManager;

        @Autowired
        public ObservacoesMedicasRepository (EntityManager entityManager){ this.entityManager = entityManager; }


        @Override
        @Transactional
        public void create(ObservacoesMedicas observacoesMedicas) {
            this.entityManager.persist(observacoesMedicas);
        }

        @Override
        public ObservacoesMedicas findById(Integer id) {
            return this.entityManager.find(ObservacoesMedicas.class, id);
        }

        @Override
        public List<ObservacoesMedicas> findAll() {
            return entityManager.createQuery("select s from ObservacoesMedicas s ORDER BY s. nome", ObservacoesMedicas.class).getResultList();
        }

        @Override
        public List<ObservacoesMedicas> findByName(String name) {
            TypedQuery<ObservacoesMedicas> query = entityManager
                    .createQuery("select s from ObservacoesMedicas s WHERE s.firstName LIKE: name", ObservacoesMedicas.class);
            query.setParameter("name", "%" + name + "%");

            return query.getResultList();
        }

        @Override
        @Transactional
        public void update(int id, ObservacoesMedicas observacoesMedicas) {
            ObservacoesMedicas observacoesMedicasInDb = this.entityManager.find(ObservacoesMedicas.class, id);

            observacoesMedicasInDb.setData(observacoesMedicas.getData());
            observacoesMedicasInDb.setObservacao(observacoesMedicas.getObservacao());


            this.entityManager.merge(observacoesMedicasInDb);
        }

        @Override
        @Transactional
        public void deleteById(int id) {
            TypedQuery<ObservacoesMedicas> query = entityManager
                    .createQuery("delete from ObservacoesMedicas s", ObservacoesMedicas.class);

            query.executeUpdate();
        }
    }


