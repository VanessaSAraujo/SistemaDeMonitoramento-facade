package com.example.sistemaMonitoramento.controlers;


import com.example.sistemaMonitoramento.entities.Paciente;
import com.example.sistemaMonitoramento.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> buscarTodos() {
        return pacienteService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Paciente> buscarPorId(@PathVariable Integer id) {
        return pacienteService.buscarPorId(id);
    }

    @PostMapping
    public Paciente gravar(@RequestBody Paciente paciente) {
        return pacienteService.gravar(paciente);
    }

    @PutMapping("/{id}")
    public Paciente atualizar(@PathVariable Integer id, @RequestBody Paciente paciente) {
        paciente.setId(id);
        return pacienteService.atualizarPaciente(paciente);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id) {
        pacienteService.excluir(id);
    }
}
