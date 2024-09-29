package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.Recepcionista;
import com.example.sistemaMonitoramento.interfaces.IRecepcionistaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public class RecepcionistaRepository implements IRecepcionistaRepository {

    private ArrayList<Recepcionista> recepcionistas = new ArrayList<>();

    @Override
    public void adicionar(Recepcionista recepcionista) {
        recepcionistas.add(recepcionista);
    }

    @Override
    public void remover(int id) {
        recepcionistas.removeIf(recepcionista -> recepcionista.getId() == id);
    }

    private Optional<Recepcionista> filtrarRecepcionista(int id) {
        return recepcionistas.stream().filter(r -> r.getId() == id).findFirst();
    }

    @Override
    public Recepcionista buscarPorId(int id) {
        return filtrarRecepcionista(id).orElse(null); // Retorna null se não encontrar
    }

    @Override
    public ArrayList<Recepcionista> buscarTodos() {
        return recepcionistas;
    }

    @Override
    public void atualizarRecepcionista(int id, Recepcionista recepcionista) {
        Optional<Recepcionista> recepcionistaInDb = filtrarRecepcionista(id);

        if (recepcionistaInDb.isPresent()) {
            Recepcionista r = recepcionistaInDb.get();
            r.setNome(recepcionista.getNome());
            r.setClinica(recepcionista.getClinica());
            r.setEmail(recepcionista.getEmail());
            r.setSenha(recepcionista.getSenha());
        }
    }
}
