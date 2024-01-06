package fr.insa.avis.model;

import jakarta.persistence.*;

@Entity
@Table(name = "avis")
public class Avis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;   // ID de l'utilisateur qui a laissé l'avis
    private Long missionId; // ID de la mission concernée par l'avis
    private String contenu; // Contenu textuel de l'avis
    private int note;       // Note sur 5

    // Constructeur par défaut
    public Avis() {
    }

    // Constructeur avec tous les champs
    public Avis(Long userId, Long missionId, String contenu, int note) {
        this.userId = userId;
        this.missionId = missionId;
        this.contenu = contenu;
        this.setNote(note); // Utilisez le setter pour appliquer la validation
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMissionId() {
        return missionId;
    }

    public void setMissionId(Long missionId) {
        this.missionId = missionId;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        if (note < 1 || note > 5) {
            throw new IllegalArgumentException("La note doit être comprise entre 1 et 5.");
        }
        this.note = note;
    }
}
