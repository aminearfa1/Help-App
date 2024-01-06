package fr.insa.model;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String email;
    private String helpRequest;

    // Constructeur par défaut
    public User() {
    }

    // Constructeur avec tous les champs
    public User(String name, String email, String helpRequest) {
        this.name = name;
        this.email = email;
        this.helpRequest = helpRequest;
    }

    // Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHelpRequest() {
        return helpRequest;
    }

    public void setHelpRequest(String helpRequest) {
        this.helpRequest = helpRequest;
    }

    // Méthode toString pour l'affichage
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", helpRequest='" + helpRequest + '\'' +
                '}';
    }
}
