package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConnectionFactory {

    private static final String URL = "jdbc:sqlite:locadora.db";
    private static final String SCHEMA_PATH = "src/database/schema.sql";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
            inicializarBanco();
        } catch (Exception e) {
            System.err.println("Erro ao inicializar banco: " + e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    private static void inicializarBanco() {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {

            String sql = Files.readString(Paths.get(SCHEMA_PATH));
            stmt.executeUpdate(sql);

            System.out.println("Banco inicializado com sucesso.");

        } catch (Exception e) {
            System.err.println("Erro ao executar o schema.sql: " + e.getMessage());
        }
    }
}
