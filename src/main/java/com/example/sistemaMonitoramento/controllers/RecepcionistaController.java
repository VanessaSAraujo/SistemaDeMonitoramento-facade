package com.example.sistemaMonitoramento.controllers;

import com.example.sistemaMonitoramento.entities.Recepcionista;
import com.example.sistemaMonitoramento.facade.RecepcionistaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecepcionistaController {

    private final RecepcionistaFacade recepcionistaFacade;

    @Autowired
    public RecepcionistaController(RecepcionistaFacade recepcionistaFacade) {
        this.recepcionistaFacade = recepcionistaFacade;
        inicializarRecepcionistas();
    }

    public void inicializarRecepcionistas() {
        recepcionistaFacade.adicionar(new Recepcionista(1, "Ana", "Clínica A", "ana@clinica.com", "senha123"));
        recepcionistaFacade.adicionar(new Recepcionista(2, "Carlos", "Clínica B", "carlos@clinica.com", "senha456"));
    }

    @GetMapping("/buscarRecepcionistas")
    public ResponseEntity<List<Recepcionista>> buscarTodos() {
        List<Recepcionista> recepcionistas = recepcionistaFacade.buscarTodos();
        return ResponseEntity.ok(recepcionistas);
    }

    @GetMapping("/buscarRecepcionista/{id}")
    public ResponseEntity<Recepcionista> buscarPorId(@PathVariable int id) {
        Recepcionista recepcionista = recepcionistaFacade.buscarPorId(id);
        return ResponseEntity.ok(recepcionista);
    }
}
