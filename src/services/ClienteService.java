package services;

import models.Cliente;

public class ClienteService {

    // Método para validar CPF
    public void cadastrarCliente(Cliente cliente){
        if (!validarCPF(cliente.getCpf())){
            System.out.println("CPF inválido.");
            return;
        }

        if (!validarTelefone(cliente.getTelefone())){
            System.out.println("Telefone inválido.");
            return;
        }
    }

    public void deletarCliente(Cliente cliente){

}