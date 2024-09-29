package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.Clinica;
import com.example.sistemaMonitoramento.interfaces.IClinicaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ClinicaRepository implements IClinicaRepository {
    private ArrayList<Clinica> clinicas = new ArrayList<>();

    public void adicionar(Clinica clinica) {
        clinicas.add(clinica);
    }

    public void remover(int id) {
        clinicas.removeIf(clinica -> clinica.getId() == id);
    }

    private Clinica filtrarClinica(int id) {
        return clinicas.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public Clinica buscarPorId(int id) {
        return filtrarClinica(id);
    }

    public ArrayList<Clinica> buscarTodos() {
        return clinicas;
    }

    public void atualizarClinica(int id, Clinica clinica) {
        Clinica clinicaInDb = filtrarClinica(id);

        if (clinicaInDb != null) {
            clinicaInDb.setNome(clinica.getNome());
            clinicaInDb.setEndereco(clinica.getEndereco());
            clinicaInDb.setTelefone(clinica.getTelefone());
            clinicaInDb.setMedicos(clinica.getMedicos());
            clinicaInDb.setPacientes(clinica.getPacientes());
        }
    }
}
