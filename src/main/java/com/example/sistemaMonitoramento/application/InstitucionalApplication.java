package com.example.sistemaMonitoramento.application;

import com.example.sistemaMonitoramento.entities.Medico;
import com.example.sistemaMonitoramento.entities.Clinica;
import com.example.sistemaMonitoramento.repositories.MedicoRepository;
import com.example.sistemaMonitoramento.repositories.ClinicaRepository;
import com.example.sistemaMonitoramento.repositories.RecepicionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitucionalApplication {
    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private ClinicaRepository clinicaRepository;

    @Autowired
    private RecepicionistaRepository recepicionistaRepository;


    public void createMedico(Medico medico) {
        medicoRepository.create(medico);
    }

    public Medico findMedicoById(Integer id) {
        return medicoRepository.findById(id);
    }

    public List<Medico> findAllMedicos() {
        return medicoRepository.findAll();
    }

    public void updateMedico(Integer id, Medico medico) {
        medicoRepository.update(id, medico);
    }

    public void deleteMedicoById(Integer id) {
        medicoRepository.deleteById(id);
    }


    public void createClinica(Clinica clinica) {
        clinicaRepository.create(clinica);
    }

    public boolean ClinicafindById(Integer id) {
        return clinicaRepository.findById(id);
    }

    public List<Clinica> findAllClinicas() {
        return clinicaRepository.findAll();
    }

    public void updateClinica(Integer id, Clinica clinica) {
        clinicaRepository.update(id, clinica);
    }

    public void deleteClinicaById(Integer id) {
        clinicaRepository.deleteById(id);
    }
}
