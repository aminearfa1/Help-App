package fr.insa.service;

import fr.insa.model.User;
import java.util.List;

public interface UserService {

    /**
     * Ajoute un nouvel utilisateur.
     * @param user L'utilisateur à ajouter.
     */
    void addUser(User user);

    /**
     * Récupère tous les utilisateurs.
     * @return Une liste de tous les utilisateurs.
     */
    List<User> getAllUsers();

    /**
     * Récupère un utilisateur spécifique par son ID.
     * @param id L'ID de l'utilisateur.
     * @return L'utilisateur correspondant à l'ID.
     */
    User getUserById(int id);

    /**
     * Met à jour les informations d'un utilisateur existant.
     * @param id L'ID de l'utilisateur à mettre à jour.
     * @param user Les nouvelles informations de l'utilisateur.
     * @return L'utilisateur mis à jour.
     */
    User updateUser(int id, User user);

    /**
     * Supprime un utilisateur.
     * @param id L'ID de l'utilisateur à supprimer.
     * @return true si l'utilisateur est supprimé avec succès, false sinon.
     */
    boolean deleteUser(int id);
}
