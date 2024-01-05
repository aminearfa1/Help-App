package fr.insa.service;

import fr.insa.model.User;
import fr.insa.util.DatabaseConnection;

import javax.jws.WebService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@WebService(endpointInterface = "fr.insa.service.UserService")
public class UserServiceImpl implements UserService {

    @Override
    public void addUser(User user) {
        // Vérifiez si l'utilisateur est null avant de procéder
        if (user == null) {
            throw new IllegalArgumentException("User object cannot be null.");
        }

        // Établissez la connexion à la base de données
        try (Connection connection = DatabaseConnection.getConnection()) {
            // Vérifiez si la table Users existe, sinon créez-la
            createUsersTableIfNotExists(connection);

            String sql = "INSERT INTO Users (name, email, help_request) VALUES (?, ?, ?)";

            // Préparation et exécution de la requête SQL
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, user.getName());
                statement.setString(2, user.getEmail());
                statement.setString(3, user.getHelpRequest());

                int affectedRows = statement.executeUpdate();

                // Vérifiez si les lignes ont été affectées
                if (affectedRows == 0) {
                    throw new SQLException("Creating user failed, no rows affected.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Remplacez par une meilleure gestion des logs en production
            // Gérer l'exception de manière appropriée
        }
    }

    // Méthode pour créer la table Users si elle n'existe pas
    private void createUsersTableIfNotExists(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Users (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255) NOT NULL," +
                    "email VARCHAR(255) NOT NULL," +
                    "help_request TEXT NOT NULL" +
                    ")";
            statement.executeUpdate(createTableSQL);
        }
    }
}
