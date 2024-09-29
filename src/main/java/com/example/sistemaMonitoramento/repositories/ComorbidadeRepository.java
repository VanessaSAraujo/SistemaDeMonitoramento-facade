package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.Comorbidade;
import com.example.sistemaMonitoramento.interfaces.IComorbidadeRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ComorbidadeRepository implements IComorbidadeRepository {
    private ArrayList<Comorbidade> comorbidades = new ArrayList<>();

    public void adicionar(Comorbidade comorbidade) {
        comorbidades.add(comorbidade);
    }

    public void remover(int id) {
        comorbidades.removeIf(c -> c.getId() == id);
    }

    private Comorbidade filtrarComorbidade(int id) {
        return comorbidades.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public Comorbidade buscarPorId(int id) {
        return filtrarComorbidade(id);
    }

    public ArrayList<Comorbidade> buscarTodos() {
        return comorbidades;
    }

    public void atualizarComorbidade(int id, Comorbidade comorbidade) {
        Comorbidade comorbidadeInDb = filtrarComorbidade(id);

        if (comorbidadeInDb != null) {
            comorbidadeInDb.setNome(comorbidade.getNome());
            comorbidadeInDb.setDescricao(comorbidade.getDescricao());
            comorbidadeInDb.setPacientes(comorbidade.getPacientes());
        }
    }
}
