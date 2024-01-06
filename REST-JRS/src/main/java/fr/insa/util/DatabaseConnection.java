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
            // Assurez-vous de charger le pilote JDBC, dépendant de votre gestionnaire de base de données
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Établit une connexion à la base de données.
     * @return Un objet Connection à la base de données.
     */
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
