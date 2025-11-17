package services;

import dao.ClienteDAO;
import java.util.List;
import models.Cliente;

public class ClienteService {

    private ClienteDAO dao = new ClienteDAO();

    // Cadastrar Cliente com validações básicas
    public void cadastrarCliente(Cliente cliente) {
        if (!validarNome(cliente.getNome())) {
            System.out.println("Nome inválido.");
            return;
        }
        if (!validarCPF(cliente.getCpf())) {
            System.out.println("CPF inválido.");
            return;
        }

        if (!validarTelefone(cliente.getTelefone())) {
            System.out.println("Telefone inválido.");
            return;
        }

        dao.inserir(cliente);
    }

    // Listar Clientes
    public List<Cliente> listarClientes() {
        return dao.listar();
    }


    // Deletar cliente pelo ID
    public void deletarCliente(int id) {
        dao.remover(id);
    }


// ============ VALIDAÇÕES ===========

    public boolean validarNome(String nome){
        return nome != null && !nome.trim().isEmpty();
    }

    public boolean validarCPF(String cpf){
        return cpf != null && cpf.matches("\\d{11}");
    }

    public boolean validarTelefone(String telefone){
        return telefone != null && telefone.matches("\\d{10,11}");
    }

}