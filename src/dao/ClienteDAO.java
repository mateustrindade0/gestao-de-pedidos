package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.Cliente;
import database.DatabaseConnection;

public class ClienteDAO {

    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, cpf, telefone) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.executeUpdate();
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        }
    }

    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Cliente c = new Cliente(rs.getString("nome"), rs.getString("cpf"), rs.getString("telefone"));
                c.setId(rs.getInt("id"));
                lista.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar clientes: " + e.getMessage());
        }
        return lista;
    }

    public void atualizar(String cpf, String nome, String telefone) {
        String sql = "UPDATE cliente SET nome=?, telefone=? WHERE cpf=?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.setString(3, cpf);
            int rows = stmt.executeUpdate();
            if (rows > 0)
                System.out.println("Cliente atualizado!");
            else
                System.out.println("Cliente não encontrado.");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar cliente: " + e.getMessage());
        }
    }

    public void remover(int id) {
    String sql = "DELETE FROM cliente WHERE id = ?";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id);
        int rows = stmt.executeUpdate();

        if (rows > 0) {
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }

    } catch (SQLException e) {
        System.out.println("Erro ao remover: " + e.getMessage());
    }
}

}
