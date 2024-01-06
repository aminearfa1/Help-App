package fr.insa.validationaide.service;

import fr.insa.validationaide.model.ValidationAide;
import fr.insa.validationaide.repository.ValidationAideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidationAideService {

    private final ValidationAideRepository validationAideRepository;

    @Autowired
    public ValidationAideService(ValidationAideRepository validationAideRepository) {
        this.validationAideRepository = validationAideRepository;
    }

    public ValidationAide validerDemandeAide(ValidationAide validationAide) {
        return validationAideRepository.save(validationAide);
    }

    // Ajoutez d'autres méthodes de service au besoin
}
