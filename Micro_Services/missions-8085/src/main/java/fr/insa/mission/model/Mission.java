package fr.insa.mission.model;

import jakarta.persistence.*;

@Entity
@Table(name = "missions")
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String motifNonValidation;
    private boolean isEstValidee;
    private StatutMission statut;

    // Constructeurs, getters et setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotifNonValidation() {
        return motifNonValidation;
    }

    public void setMotifNonValidation(String motifNonValidation) {
        this.motifNonValidation = motifNonValidation;
    }

    public boolean isEstValidee() {
        return isEstValidee;
    }

    public void setEstValidee(boolean estValidee) {
        isEstValidee = estValidee;
    }

    public StatutMission getStatut() {
        return statut;
    }

    public void setStatut(StatutMission statut) {
        this.statut = statut;
    }
}
