package fr.insa.validationaide.controller;

import fr.insa.validationaide.model.ValidationAide;
import fr.insa.validationaide.service.ValidationAideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validation_aide")
public class ValidationAideController {

    private final ValidationAideService validationAideService;

    @Autowired
    public ValidationAideController(ValidationAideService validationAideService) {
        this.validationAideService = validationAideService;
    }

    @PostMapping
    public ValidationAide validerDemandeAide(@RequestBody ValidationAide validationAide) {
        return validationAideService.validerDemandeAide(validationAide);
    }

    // Ajoutez d'autres méthodes au besoin
}
