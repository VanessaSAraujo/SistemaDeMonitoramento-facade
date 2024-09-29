package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.Recepcionista;
import com.example.sistemaMonitoramento.interfaces.IRecepcionistaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RecepicionistaRepository implements IRecepcionistaRepository {
    private ArrayList<Recepcionista> recepcionistas = new ArrayList<Recepcionista>();

    public void adicionar(Recepcionista recepcionista) {
        recepcionistas.add(recepcionista);
    }

    public void remover(int id) {
        recepcionistas.removeIf(recepcionista -> recepcionista.getId() == id);
    }

    private Recepcionista filtrarRecepcionista(int id) {
        return recepcionistas.stream().filter(r -> r.getId() == id).findFirst();
    }

    public Recepcionista buscarPorId(int id) {
        Recepcionista recepcionistaInDb = filtrarRecepcionista(id);

        return recepcionistaInDb;
    }

    public ArrayList<Recepcionista> buscarTodos() {
        return recepcionistas;
    }

    public void atualizarRecepcionista(int id, Recepcionista recepcionista) {
        Recepcionista recepcionistaInDb = filtrarRecepcionista(id);

        recepcionistaInDb.setNome(recepcionista.getNome());
        recepcionistaInDb.setClinica(recepcionista.getClinica());
        recepcionistaInDb.setEmail(recepcionista.getEmail());
        recepcionistaInDb.setSenha(recepcionista.getSenha());
    }
}