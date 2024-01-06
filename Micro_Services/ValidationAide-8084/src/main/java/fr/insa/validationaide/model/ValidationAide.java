package fr.insa.validationaide.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;


@Entity
@Table(name = "validations_aide")
public class ValidationAide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long demandeAideId;
    private boolean estValidee;

    // Constructeur par défaut
    public ValidationAide() {
    }

    // Constructeur avec paramètres
    public ValidationAide(Long demandeAideId, boolean estValidee) {
        this.demandeAideId = demandeAideId;
        this.estValidee = estValidee;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDemandeAideId() {
        return demandeAideId;
    }

    public void setDemandeAideId(Long demandeAideId) {
        this.demandeAideId = demandeAideId;
    }

    public boolean isEstValidee() {
        return estValidee;
    }

    public void setEstValidee(boolean estValidee) {
        this.estValidee = estValidee;
    }
}
