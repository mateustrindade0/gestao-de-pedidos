package services;

import models.Cliente;
import java.util.List;

import dao.ClienteDAO;

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

    // Atualizar Cliente com validações básicas
    public void atualizarCliente(String cpf, String nome, String telefone) {
        if (!validarCPF(cpf)) {
            System.out.println("CPF inválido.");
            return;
        }

        if (!validarNome(nome)) {
            System.out.println("Nome inválido.");
            return;
        }

        if (!validarTelefone(telefone)) {
            System.out.println("Telefone inválido.");
            return;
        }

        dao.atualizar(cpf, nome, telefone);
    }

    // Deletar cliente pelo ID
    public void deletarCliente(Cliente cliente) {
        dao.remover(cliente.getId());  
    }



