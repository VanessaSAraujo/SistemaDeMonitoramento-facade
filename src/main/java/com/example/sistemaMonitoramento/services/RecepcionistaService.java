package com.example.sistemaMonitoramento.services;

import com.example.sistemaMonitoramento.entities.Recepcionista;
import com.example.sistemaMonitoramento.repositories.RecepcionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecepcionistaService {

    @Autowired
    private RecepcionistaRepository recepcionistaRepository;

    public void adicionarRecepcionista(Recepcionista recepcionista) {
        recepcionistaRepository.adicionar(recepcionista);
    }

    public void removerRecepcionista(int id) {
        recepcionistaRepository.remover(id);
    }

    public Recepcionista buscarRecepcionistaPorId(int id) {
        return recepcionistaRepository.buscarPorId(id);
    }

    public List<Recepcionista> buscarTodosRecepcionistas() {
        return recepcionistaRepository.buscarTodos();
    }
    
    public void atualizarRecepcionista(int id, Recepcionista recepcionista) {
        recepcionistaRepository.atualizarRecepcionista(id, recepcionista);
    }
}
