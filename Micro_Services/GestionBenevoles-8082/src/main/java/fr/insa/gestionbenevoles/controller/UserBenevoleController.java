package fr.insa.gestionbenevoles.controller;

import fr.insa.gestionbenevoles.model.UserBenevole;
import fr.insa.gestionbenevoles.service.UserBenevoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/benevoles")
public class UserBenevoleController {

    private final UserBenevoleService userBenevoleService;
    @Autowired
    public UserBenevoleController(UserBenevoleService userBenevoleService) {
        this.userBenevoleService = userBenevoleService;
    }

    @GetMapping
    public List<UserBenevole> getAllBenevoles() {
        return userBenevoleService.getAllBenevoles();
    }

    @GetMapping("/{id}")
    public Optional<UserBenevole> getBenevoleById(@PathVariable Long id) {
        return userBenevoleService.getBenevoleById(id);
    }

    @PostMapping
    public UserBenevole createBenevole(@RequestBody UserBenevole benevole) {
        return userBenevoleService.createBenevole(benevole);
    }

    @PutMapping("/{id}")
    public UserBenevole updateBenevole(@PathVariable Long id, @RequestBody UserBenevole benevole) {
        return userBenevoleService.updateBenevole(id, benevole);
    }

    @DeleteMapping("/{id}")
    public void deleteBenevole(@PathVariable Long id) {
        userBenevoleService.deleteBenevole(id);
    }
}
