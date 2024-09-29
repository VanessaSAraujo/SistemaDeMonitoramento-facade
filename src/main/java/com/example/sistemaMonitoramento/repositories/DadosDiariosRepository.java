package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.DadosDiarios;
import com.example.sistemaMonitoramento.interfaces.IDadosDiariosRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class DadosDiariosRepository implements IDadosDiariosRepository {
    private ArrayList<DadosDiarios> dadosDiarios = new ArrayList<>();

    public void adicionar(DadosDiarios dados) {
        dadosDiarios.add(dados);
    }

    public void remover(int id) {
        dadosDiarios.removeIf(d -> d.getId() == id);
    }

    private DadosDiarios filtrarDados(int id) {
        return dadosDiarios.stream().filter(d -> d.getId() == id).findFirst().orElse(null);
    }

    public DadosDiarios buscarPorId(int id) {
        return filtrarDados(id);
    }

    public ArrayList<DadosDiarios> buscarTodos() {
        return dadosDiarios;
    }

    public void atualizarDadosDiarios(int id, DadosDiarios dados) {
        DadosDiarios dadosInDb = filtrarDados(id);

        if (dadosInDb != null) {
            dadosInDb.setData(dados.getData());
            dadosInDb.setHorarioMedicacao(dados.getHorarioMedicacao());
            dadosInDb.setDescricaoDia(dados.getDescricaoDia());
            dadosInDb.setDesconforto(dados.getDesconforto());
            dadosInDb.setOutrasMedicacoes(dados.getOutrasMedicacoes());
            dadosInDb.setPaciente(dados.getPaciente());
        }
    }
}
