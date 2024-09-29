package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.ObservacoesMedicas;
import com.example.sistemaMonitoramento.interfaces.IObservacoesMedicasRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;

@Repository
public class ObservacoesMedicasRepository implements IObservacoesMedicasRepository {
    private ArrayList<ObservacoesMedicas> observacoesMedicas = new ArrayList<ObservacoesMedicas>();

    public void adicionar(ObservacoesMedicas observacao) {
        observacoesMedicas.add(observacao);
    }

    public void remover(int id) {
        observacoesMedicas.removeIf(observacao -> observacao.getId() == id);
    }

    private ObservacoesMedicas filtrarObservacao(int id) {
        return observacoesMedicas.stream().filter(o -> o.getId() == id).findFirst();
    }

    public ObservacoesMedicas buscarPorId(int id) {
        ObservacoesMedicas observacoesMedicasInDb = filtrarObservacao(id);

        return observacoesMedicasInDb;
    }

    public ArrayList<ObservacoesMedicas> buscarTodos() {
        return observacoesMedicas;
    }

    public void atualizarObservacao(int id, ObservacoesMedicas observacao) {
            ObservacoesMedicas observacoesMedicasInDb = filtrarObservacao(id);

            observacoesMedicasInDb.setPaciente(observacao.getPaciente());
            observacoesMedicasInDb.setMedico(observacao.getMedico());
            observacoesMedicasInDb.setData(observacao.getData());
            observacoesMedicasInDb.setObservacao(observacao.getObservacao());
    }

}


