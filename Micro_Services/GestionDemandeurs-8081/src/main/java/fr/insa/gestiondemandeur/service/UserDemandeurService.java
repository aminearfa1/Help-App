package fr.insa.gestiondemandeur.service;

import fr.insa.gestiondemandeur.model.UserDemandeur;
import fr.insa.gestiondemandeur.repository.UserDemandeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDemandeurService {

    private final UserDemandeurRepository userDemandeurRepository;

    @Autowired
    public UserDemandeurService(UserDemandeurRepository userDemandeurRepository) {
        this.userDemandeurRepository = userDemandeurRepository;
    }

    public List<UserDemandeur> getAllDemandeurs() {
        return userDemandeurRepository.findAll();
    }

    public Optional<UserDemandeur> getDemandeurById(Long id) {
        return userDemandeurRepository.findById(id);
    }

    public UserDemandeur createDemandeur(UserDemandeur demandeur) {
        return userDemandeurRepository.save(demandeur);
    }

    public UserDemandeur updateDemandeur(Long id, UserDemandeur demandeur) {
        if (userDemandeurRepository.existsById(id)) {
            demandeur.setId(id);
            return userDemandeurRepository.save(demandeur);
        }
        return null; // Retourner null si l'ID n'existe pas
    }

    public void deleteDemandeur(Long id) {
        userDemandeurRepository.deleteById(id);
    }
}
