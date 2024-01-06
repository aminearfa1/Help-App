package fr.insa.gestiondemandeur.controller;

import fr.insa.gestiondemandeur.model.UserDemandeur;
import fr.insa.gestiondemandeur.service.UserDemandeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/demandeurs")
public class UserDemandeurController {

    private final UserDemandeurService userDemandeurService;

    @Autowired
    public UserDemandeurController(UserDemandeurService userDemandeurService) {
        this.userDemandeurService = userDemandeurService;
    }

    @GetMapping
    public List<UserDemandeur> getAllDemandeurs() {
        return userDemandeurService.getAllDemandeurs();
    }

    @GetMapping("/{id}")
    public Optional<UserDemandeur> getDemandeurById(@PathVariable Long id) {
        return userDemandeurService.getDemandeurById(id);
    }

    @PostMapping
    public UserDemandeur createDemandeur(@RequestBody UserDemandeur demandeur) {
        return userDemandeurService.createDemandeur(demandeur);
    }

    @PutMapping("/{id}")
    public UserDemandeur updateDemandeur(@PathVariable Long id, @RequestBody UserDemandeur demandeur) {
        return userDemandeurService.updateDemandeur(id, demandeur);
    }

    @DeleteMapping("/{id}")
    public void deleteDemandeur(@PathVariable Long id) {
        userDemandeurService.deleteDemandeur(id);
    }
}
