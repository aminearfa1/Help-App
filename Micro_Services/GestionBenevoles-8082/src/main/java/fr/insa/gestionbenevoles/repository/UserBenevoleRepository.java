package fr.insa.gestionbenevoles.repository;

import fr.insa.gestionbenevoles.model.UserBenevole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBenevoleRepository extends JpaRepository<UserBenevole, Long> {
    // Méthodes de recherche personnalisées si nécessaire
}
