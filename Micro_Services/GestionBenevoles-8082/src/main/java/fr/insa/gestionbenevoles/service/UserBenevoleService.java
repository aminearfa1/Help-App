package fr.insa.gestionbenevoles.service;

import fr.insa.gestionbenevoles.model.UserBenevole;
import fr.insa.gestionbenevoles.repository.UserBenevoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserBenevoleService {

    private final UserBenevoleRepository userBenevoleRepository;

    @Autowired
    public UserBenevoleService(UserBenevoleRepository userBenevoleRepository) {
        this.userBenevoleRepository = userBenevoleRepository;
    }

    public List<UserBenevole> getAllBenevoles() {
        return userBenevoleRepository.findAll();
    }

    public Optional<UserBenevole> getBenevoleById(Long id) {
        return userBenevoleRepository.findById(id);
    }

    public UserBenevole createBenevole(UserBenevole benevole) {
        return userBenevoleRepository.save(benevole);
    }

    public UserBenevole updateBenevole(Long id, UserBenevole benevole) {
        if (userBenevoleRepository.existsById(id)) {
            benevole.setId(id);
            return userBenevoleRepository.save(benevole);
        }
        return null; // Retourner null si l'ID n'existe pas
    }

    public void deleteBenevole(Long id) {
        if (userBenevoleRepository.existsById(id)) {
            userBenevoleRepository.deleteById(id);
        }
    }

}
