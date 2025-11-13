package utils;

public class ReservaMonitor implements Runnable {
    @Override
    public void run() {
        Log.log("Monitor executado — verificando reservas vencidas (exemplo)");
        // No futuro, aqui você chamará LocacaoService.verificarReservasVencidas()
    }
}
