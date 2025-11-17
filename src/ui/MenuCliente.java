
package ui;

import java.util.Scanner;
import models.Cliente;
import services.ClienteService;

public class MenuCliente {
    Scanner scanner = new Scanner(System.in);
    ClienteService clienteService = new ClienteService();

    public void exibirMenu() {
        int opcao = -1;

        try {
            do {
                System.out.println("\n=== Menu Cliente ===");
                System.out.println("1. Cadastrar Cliente");
                System.out.println("2. Deletar Cliente");
                System.out.println("3. Listar Clientes");
                System.out.println("0. Voltar ao Menu Principal");

                System.out.print("Escolha uma opção: ");
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) { 
                    case 1 -> cadastrarCliente();
                    case 2 -> deletarCliente();
                    case 3 -> listarClientes();
                    case 0 -> System.out.println("Voltando ao Menu Principal.");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Digite um número.");
        }
    }

    // Função pra cadastrar os clientes
    private void cadastrarCliente(){
        System.out.println("Cadastrar cliente selecionado.");
        
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        
        System.out.println("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();
        
        Cliente cliente = new Cliente(nome, cpf, telefone);
        clienteService.cadastrarCliente(cliente);   
    }

    // Função pra listar os clientes
    private void listarClientes(){
        System.out.println("Listar clientes selecionado.");
        clienteService.listarClientes().forEach(System.out::println);
    } 

    // Função pra deletar os clientes
    private void deletarCliente(){
        System.out.println("Deletar cliente selecionado.");
        System.out.println("Digite o ID do cliente a ser deletado: ");
        try {
            int id = Integer.parseInt(scanner.nextLine());
            clienteService.deletarCliente(id);
        } catch (NumberFormatException e) {
            System.out.println("ID inválido! Por favor, digite um número válido.");
        }
        
    }
}