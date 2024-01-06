package fr.insa.uservalidateur.service;

import fr.insa.uservalidateur.model.UserValidateur;
import fr.insa.uservalidateur.repository.UserValidateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserValidateurService {

    private final UserValidateurRepository userValidateurRepository;

    @Autowired
    public UserValidateurService(UserValidateurRepository userValidateurRepository) {
        this.userValidateurRepository = userValidateurRepository;
    }

    public List<UserValidateur> getAllValidateurs() {
        return userValidateurRepository.findAll();
    }

    public Optional<UserValidateur> getValidateurById(Long id) {
        return userValidateurRepository.findById(id);
    }

    public UserValidateur createValidateur(UserValidateur validateur) {
        return userValidateurRepository.save(validateur);
    }

    public UserValidateur updateValidateur(Long id, UserValidateur validateur) {
        return userValidateurRepository.findById(id)
                .map(existingValidateur -> {
                    existingValidateur.setNom(validateur.getNom());
                    existingValidateur.setPrenom(validateur.getPrenom());
                    existingValidateur.setEmail(validateur.getEmail());
                    // Mettre à jour d'autres champs si nécessaire
                    return userValidateurRepository.save(existingValidateur);
                })
                .orElseGet(() -> {
                    validateur.setId(id);
                    return userValidateurRepository.save(validateur);
                });
    }

    public void deleteValidateur(Long id) {
        userValidateurRepository.deleteById(id);
    }

    // Ajoutez ici toute logique métier supplémentaire si nécessaire
}
