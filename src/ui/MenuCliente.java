
package ui;

import java.util.Scanner;

public class MenuCliente {

    public void exibirMenu() {
        int opcao;

        try {
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("\n=== Menu Cliente ===");
                System.out.println("1. Cadastrar Cliente");
                System.out.println("2. Deletar Cliente");
                System.out.println("3. Listar Clientes");
                System.out.println("0. Voltar ao Menu Principal");

                System.out.println("Escolha uma opção: ");
                opcao = scanner.nextInt();
            } while (opcao < 0 || opcao > 3);

            switch (opcao) { // Precisa ainda fazer a lógica para cada opção
                case 1:
                    System.out.println("Cadastrar cliente selecionado.");
                    break;
                case 2:
                    System.out.println("Deletar cliente selecionado.");
                    break;
                case 3:
                    System.out.println("Listar clientes selecionado.");
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Erro na entrada de dados: " + e.getMessage());
        }
    }
}