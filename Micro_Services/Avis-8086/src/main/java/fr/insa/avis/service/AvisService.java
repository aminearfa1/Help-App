package fr.insa.avis.service;

import fr.insa.avis.model.Avis;
import fr.insa.avis.repository.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvisService {

    private final AvisRepository avisRepository;

    @Autowired
    public AvisService(AvisRepository avisRepository) {
        this.avisRepository = avisRepository;
    }

    public Avis createAvis(Avis avis) {
        // Vous pouvez ajouter ici une logique métier supplémentaire avant de sauvegarder l'avis
        return avisRepository.save(avis);
    }

    public List<Avis> findAllAvis() {
        return avisRepository.findAll();
    }

    public Optional<Avis> findAvisById(Long id) {
        return avisRepository.findById(id);
    }

    public Optional<Avis> updateAvis(Long id, Avis updatedAvis) {
        return avisRepository.findById(id)
                .map(avis -> {
                    avis.setContenu(updatedAvis.getContenu());
                    avis.setNote(updatedAvis.getNote());
                    // Mettre à jour d'autres champs si nécessaire
                    return avisRepository.save(avis);
                });
    }

    public void deleteAvis(Long id) {
        avisRepository.deleteById(id);
    }

    // Vous pouvez ajouter ici d'autres méthodes selon les besoins de votre application
}
