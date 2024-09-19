package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.Medico;
import com.example.sistemaMonitoramento.interfaces.IMedicoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MedicoRepository implements IMedicoRepository {
    private EntityManager entityManager;

    @Autowired
    public MedicoRepository (EntityManager entityManager){ this.entityManager = entityManager; }


    @Override
    @Transactional
    public void create(Medico medico) {
        this.entityManager.persist(medico);
    }


    @Override
    public Medico findById(Integer id) {
        return this.entityManager.find(Medico.class, id);
    }

    @Override
    public List<Medico> findAll() {
        return entityManager.createQuery("select s from Medico s ORDER BY s. nome", Medico.class).getResultList();
    }

    @Override
    public List<Medico> findByName(String name) {
        TypedQuery<Medico> query = entityManager
                .createQuery("select s from Student s WHERE s.firstName LIKE: name", Medico.class);
        query.setParameter("name", "%" + name + "%");

        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(int id, Medico medico) {
        Medico MedicoInDb = this.entityManager.find(Medico.class, id);

        MedicoInDb.setClinica(medico.getClinica());
        MedicoInDb.setContato(medico.getContato());
        MedicoInDb.setNome(medico.getNome());
        MedicoInDb.setCrm(medico.getCrm());
        MedicoInDb.setEmail(medico.getEmail());
        MedicoInDb.setEspecialidade(medico.getEspecialidade());

        this.entityManager.merge(MedicoInDb);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        TypedQuery<Medico> query = entityManager
                .createQuery("delete from Student s", Medico.class);

        query.executeUpdate();
    }
}
