package com.example.sistemaMonitoramento.controllers;

import com.example.sistemaMonitoramento.entities.Clinica;
import com.example.sistemaMonitoramento.facade.ClinicaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecepcionistaController {

    private final RecepcionistaFacade recepcionistaFacade;

    @Autowired
    public RecepcionistaController(RecepcionistaFacade recepcionistaFacade) {
        this.recepcionistaFacade = recepcionistaFacade;
    }

    @GetMapping("/buscarRecepcionista")
    public ResponseEntity<List<Recepcionista>> buscarTodos() {
        List<Recepcionista> recepcionista = recepcionistaFacade.buscarTodos();

        return ResponseEntity.ok(recepcionistas);
    }

    @GetMapping("/buscarRecepcionista/{id}")
    public ResponseEntity<Recepcionista> buscarPorId(@PathVariable int id) {
        Recepcionista recepcionista = recepcionistaFacade.buscarPorId(id);
        if (recepcionista == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return ResponseEntity.ok(recepcionista);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizar(@PathVariable int id, @RequestBody Recepcionista recepcionista) {
        recepcionistaFacade.atualizarRecepcionista(id, recepcionista);

        return ResponseEntity.ok(null);
    }

    @PostMapping("/")
    public ResponseEntity<Void> adicionar(@RequestBody Recepcionista recepcionista) {
        recepcionistaFacade.adicionar(recepcionista);

        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable int id) {
        recepcionistaFacade.remover(id);

        return ResponseEntity.ok(null);
    }
}

