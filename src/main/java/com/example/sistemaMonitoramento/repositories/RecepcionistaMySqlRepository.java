package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.Recepcionista;
import com.example.sistemaMonitoramento.interfaces.IRecepcionistaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//pra testar que nem o professor fez

@Repository
public class RecepcionistaMySqlRepository implements IRecepcionistaRepository {


    @Override
    public void adicionar(Recepcionista recepcionista) {

    }

    @Override
    public void remover(int id) {

    }

    @Override
    public Recepcionista buscarPorId(int id) {
        return null;
    }

    @Override
    public List<Recepcionista> buscarTodos() {
        return null;
    }

    @Override
    public void atualizarRecepcionista(int id, Recepcionista recepcionista) {
        String sql = "UPDATE recepcionistas SET nome = ?, clinica = ?, email = ?, senha = ? WHERE id = ?";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, recepcionista.getNome());
            stmt.setString(2, recepcionista.getClinica());
            stmt.setString(3, recepcionista.getEmail());
            stmt.setString(4, recepcionista.getSenha());
            stmt.setInt(5, id);

            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar recepcionista", e);
        }
    }
}
