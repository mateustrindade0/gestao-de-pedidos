package ui;

import java.util.ArrayList;
import java.util.Scanner;
import models.*;

public class VeiculoMenu {
    private static ArrayList<Veiculo> veiculos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    static {
        // Carros
        veiculos.add(new Carro(1, "T-Cross", "Volkswagen", 2024, 480, 4));
        veiculos.add(new Carro(2, "T-Cross", "Volkswagen", 2024, 480, 4));
        veiculos.add(new Carro(3, "T-Cross", "Volkswagen", 2024, 480, 4));

        veiculos.add(new Carro(4, "Jetta", "Volkswagen", 2025, 650, 4));
        veiculos.add(new Carro(5, "Jetta", "Volkswagen", 2025, 650, 4));
        veiculos.add(new Carro(6, "Jetta", "Volkswagen", 2025, 650, 4));

        veiculos.add(new Carro(7, "Onix", "Chevrolet", 2025, 380, 4));
        veiculos.add(new Carro(8, "Onix", "Chevrolet", 2025, 380, 4));
        veiculos.add(new Carro(9, "Onix", "Chevrolet", 2025, 380, 4));

        // Motos
        veiculos.add(new Moto(10, "CG 160", "Honda", 2023, 140, 160));
        veiculos.add(new Moto(11, "CG 160", "Honda", 2023, 140, 160));
        veiculos.add(new Moto(12, "CG 160", "Honda", 2023, 140, 160));
        veiculos.add(new Moto(13, "Hornet", "Honda", 2024, 320, 600));
    }

    public static void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n=== MENU VEÍCULOS ===");
            System.out.println("1. Listar veículos");
            System.out.println("2. Calcular diária");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> listarVeiculos();
                case 2 -> calcularDiaria();
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
        System.out.println("\nLista de Veículos:");
        for (Veiculo v : veiculos) {
            System.out.println(v);
        }
    }

    private static void calcularDiaria() {
        System.out.print("ID do veículo: ");
        int id = sc.nextInt();

        for (Veiculo v : veiculos) {
            if (v.getId() == id) {
                System.out.println("Diária ajustada: R$" + v.calcularDiaria());
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }
}