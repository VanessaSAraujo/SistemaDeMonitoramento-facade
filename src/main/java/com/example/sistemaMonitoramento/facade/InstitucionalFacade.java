package com.example.sistemaMonitoramento.facade;

import com.example.sistemaMonitoramento.entities.Medico;
import com.example.sistemaMonitoramento.entities.Clinica;
import com.example.sistemaMonitoramento.repositories.ClinicaRepository;
import com.example.sistemaMonitoramento.repositories.MedicoRepository;
import com.example.sistemaMonitoramento.repositories.RecepcionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InstitucionalFacade {

    @Autowired
    private ClinicaRepository clinicaRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private RecepcionistaRepository recepcionistaRepository;

    // Medico CRUD
    public void createMedico(Medico medico) {
        medicoRepository.create(medico); // Usando o método save do repository para criar
    }

    public Medico findMedicoById(Integer id) {
        return medicoRepository.findById(id).orElse(null); // Usando o método findById do repository
    }

    public List<Medico> findAllMedicos() {
        return medicoRepository.findAll(); // Usando o método findAll do repository
    }

    public void updateMedico(Integer id, Medico medico) {
        if (medicoRepository.findById(id)) {
            medico.setId(id);
            medicoRepository.update(id, medico); // Usando o método save do repository para atualizar
        }
    }

    public void deleteMedicoById(Integer id) {
        if (medicoRepository.findById(id)) {
            medicoRepository.deleteById(id); // Usando o método deleteById do repository
        }
    }

    // Clinica CRUD
    public void createClinica(Clinica clinica) {
        clinicaRepository.create(clinica); // Usando o método save do repository para criar
    }

    public Clinica findClinicaById(Integer id) {
        return clinicaRepository.findById(id).orElse(null); // Usando o método findById do repository
    }

    public List<Clinica> findAllClinicas() {
        return clinicaRepository.findAll(); // Usando o método findAll do repository
    }

    public void updateClinica(Integer id, Clinica clinica) {
        if (clinicaRepository.findById(id)) {
            clinica.setId(id);
            clinicaRepository.update(id, clinica); // Usando o método save do repository para atualizar
        }
    }

    public void deleteClinicaById(Integer id) {
        if (clinicaRepository.findById(id)) {
            clinicaRepository.deleteById(id); // Usando o método deleteById do repository
        }
    }
}
