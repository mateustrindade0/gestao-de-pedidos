
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import utils.Log;
import utils.ReservaMonitor;
import ui.MenuCliente;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inicia sistema de log
        Log.iniciar();

        // Inicia thread de monitoramento
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(new ReservaMonitor(), 0, 1, TimeUnit.MINUTES);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== LOCADORA DE VEÍCULOS =====");
            System.out.println("1 - Gerenciar Clientes (em breve)");
            System.out.println("2 - Gerenciar Veículos (em breve)");
            System.out.println("3 - Realizar Locação (em breve)");
            System.out.println("4 - Finalizar Locação (em breve)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida!");
                continue;
            }

            switch (opcao) {
                case 1:
                    MenuCliente MenuCliente = new MenuCliente();
                    MenuCliente.exibirMenu();
                    break;
            }
        }

        scheduler.shutdown();
        Log.parar();
        sc.close();
    }
}
