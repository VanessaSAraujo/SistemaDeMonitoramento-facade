package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.DadosDiarios;
import com.example.sistemaMonitoramento.interfaces.IDadosDiariosRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DadosDiariosRepository implements IDadosDiariosRepository {
    private EntityManager entityManager;

    @Autowired
    public DadosDiariosRepository (EntityManager entityManager){ this.entityManager = entityManager; }


    @Override
    @Transactional
    public void create(DadosDiarios dadosDiarios) {
        this.entityManager.persist(dadosDiarios);
    }

    @Override
    public DadosDiarios findById(Integer id) {
        return this.entityManager.find(DadosDiarios.class, id);
    }

    @Override
    public List<DadosDiarios> findAll() {
        return entityManager.createQuery("select s from DadosDiarios s ORDER BY s. nome", DadosDiarios.class).getResultList();
    }

    @Override
    public List<DadosDiarios> findByName(String name) {
        TypedQuery<DadosDiarios> query = entityManager
                .createQuery("select s from DadosDiarios s WHERE s.firstName LIKE: name", DadosDiarios.class);
        query.setParameter("name", "%" + name + "%");

        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(int id, DadosDiarios dadosDiarios) {
        DadosDiarios dadosDiariosInDb = this.entityManager.find(DadosDiarios.class, id);

        dadosDiariosInDb.setData(dadosDiarios.getData());
        dadosDiariosInDb.setDesconforto(dadosDiarios.getDesconforto());
        dadosDiariosInDb.setDescricaoDia(dadosDiarios.getDescricaoDia());
        dadosDiariosInDb.setPaciente(dadosDiarios.getPaciente());
        dadosDiariosInDb.setHorarioMedicacao(dadosDiarios.getHorarioMedicacao());
        dadosDiariosInDb.setOutrasMedicacoes(dadosDiarios.getOutrasMedicacoes());

        this.entityManager.merge(dadosDiariosInDb);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        TypedQuery<DadosDiarios> query = entityManager
                .createQuery("delete from DadosDiarios s", DadosDiarios.class);

        query.executeUpdate();
    }
}
