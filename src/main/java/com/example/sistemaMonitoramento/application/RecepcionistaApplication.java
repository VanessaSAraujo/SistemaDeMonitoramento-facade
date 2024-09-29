package com.example.sistemaMonitoramento.applications;

import com.example.sistemaMonitoramento.entities.Recepcionista;
import com.example.sistemaMonitoramento.repositories.RecepicionistaRepository;
import com.example.sistemaMonitoramento.services.RecepcionistaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecepcionistaApplication {
    private RecepicionistaRepository recepcionistaRepository;
    private RecepcionistaService recepcionistaService;

    public RecepcionistaApplication(RecepicionistaRepository recepcionistaRepository, RecepcionistaService recepcionistaService) {
        this.recepcionistaRepository = recepcionistaRepository;
        this.recepcionistaService = recepcionistaService;
    }

    public void adicionar(Recepcionista recepcionista) {
        this.recepcionistaRepository.adicionar(recepcionista);
    }

    public void remover(int id) {
        this.recepcionistaRepository.remover(id);
    }

    public Recepcionista buscarPorId(int id) {
        return this.recepcionistaRepository.buscarPorId(id);
    }

    public List<Recepcionista> buscarTodos() {
        return this.recepcionistaRepository.buscarTodos();
    }

    public void atualizarRecepcionista(int id, Recepcionista recepcionista) {
        this.recepcionistaRepository.atualizarRecepcionista(id, recepcionista);
    }
}
