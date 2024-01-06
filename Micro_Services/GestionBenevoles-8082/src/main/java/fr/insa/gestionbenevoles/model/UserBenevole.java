package fr.insa.gestionbenevoles.model;

import jakarta.persistence.*;

@Entity
@Table(name = "benevoles")
public class UserBenevole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    @Column(unique=true)
    private String email;
    // Ajoutez ici des attributs spécifiques aux bénévoles

    public UserBenevole() {
    }

    public UserBenevole(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }
    // Getters et setters pour id, nom, prenom, email
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Ajoutez d'autres méthodes ou attributs spécifiques aux demandeurs si nécessaire
}
