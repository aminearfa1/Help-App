package fr.insa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String JDBC_URL = "jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_058";
    private static final String USERNAME = "projet_gei_058";
    private static final String PASSWORD = "oor1aiPo";

    static {
        try {
            // Assurez-vous que le driver JDBC est chargé
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // Gérer l'exception de manière appropriée
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
}
