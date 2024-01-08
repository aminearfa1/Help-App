package fr.insa.uservalidateur.controller;

import fr.insa.uservalidateur.model.UserValidateur;
import fr.insa.uservalidateur.service.UserValidateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/validateurs")
public class UserValidateurController {

    private final UserValidateurService userValidateurService;

    @Autowired
    public UserValidateurController(UserValidateurService userValidateurService) {
        this.userValidateurService = userValidateurService;
    }

    @GetMapping
    public List<UserValidateur> getAllValidateurs() {
        return userValidateurService.getAllValidateurs();
    }

    @GetMapping("/{id}")
    public Optional<UserValidateur> getValidateurById(@PathVariable Long id) {
        return userValidateurService.getValidateurById(id);
    }

    @PostMapping
    public UserValidateur createValidateur(@RequestBody UserValidateur validateur) {
        return userValidateurService.createValidateur(validateur);
    }


}
