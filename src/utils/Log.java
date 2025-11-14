package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Log {
    private static PrintWriter writer;
    private static boolean ativo = false;

    public static void iniciar() {
        try {
            writer = new PrintWriter(new FileWriter("logs.txt", true));
            ativo = true;
            log("Sistema iniciado.");
        } catch (IOException e) {
            System.out.println("Erro ao iniciar log: " + e.getMessage());
        }
    }

    public static void log(String msg) {
        if (ativo) {
            writer.println(LocalDateTime.now() + " - " + msg);
            writer.flush();
        }
    }

    public static void parar() {
        log("Sistema encerrado.");
        if (writer != null) {
            writer.close();
        }
        ativo = false;
    }
}
