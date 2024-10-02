package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.Medico;
import com.example.sistemaMonitoramento.interfaces.IMedicoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class MedicoRepository implements IMedicoRepository {
    private ArrayList<Medico> medicos = new ArrayList<>();

    public void adicionar(Medico medico) {
        medicos.add(medico);
    }

    public void remover(int id) {
        medicos.removeIf(medico -> medico.getId() == id);
    }

    private Medico filtrarMedico(int id) {
        return medicos.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }

    public Medico buscarPorId(int id) {
        return filtrarMedico(id);
    }

    public ArrayList<Medico> buscarTodos() {
        return medicos;
    }

    public void atualizarMedico(int id, Medico medico) {
        Medico medicoInDb = filtrarMedico(id);

        if (medicoInDb != null) {
            medicoInDb.setNome(medico.getNome());
            medicoInDb.setEspecialidade(medico.getEspecialidade());
            medicoInDb.setContato(medico.getContato());
            medicoInDb.setEmail(medico.getEmail());
            medicoInDb.setSenha(medico.getSenha());
            medicoInDb.setCrm(medico.getCrm());
            medicoInDb.setClinica(medico.getClinica());
        }
    }
}
