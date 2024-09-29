package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.Paciente;
import com.example.sistemaMonitoramento.interfaces.IPacienteRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PacienteRepository implements IPacienteRepository {
    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

    public void adicionar(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void remover(int id) {
        pacientes.removeIf(paciente -> paciente.getId() == id);
    }

    private Paciente filtrarPaciente(int id) {
        return pacientes.stream().filter(p -> p.getId() == id).findFirst();
    }

    public Paciente buscarPorId(int id) {
        Paciente pacienteInDb = filtrarPaciente(id);

        return pacienteInDb;
    }

    public ArrayList<Paciente> buscarTodos() {
        return pacientes;
    }

    public void atualizarPaciente(int id, Paciente paciente) {
        Paciente pacienteInDb = filtrarPaciente(id);

        pacienteInDb.setNome(paciente.getNome());
        pacienteInDb.setIdade(paciente.getIdade());
        pacienteInDb.setHistoricoMedico(paciente.getHistoricoMedico());
        pacienteInDb.setContato(paciente.getContato());
        pacienteInDb.setEmail(paciente.getEmail());
        pacienteInDb.setSenha(paciente.getSenha());
        pacienteInDb.setComorbidade(paciente.getComorbidade());
        pacienteInDb.setClinica(paciente.getClinica());
    }
}