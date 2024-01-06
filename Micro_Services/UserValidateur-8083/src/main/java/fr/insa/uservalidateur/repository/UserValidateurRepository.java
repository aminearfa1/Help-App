package fr.insa.uservalidateur.repository;

import fr.insa.uservalidateur.model.UserValidateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserValidateurRepository extends JpaRepository<UserValidateur, Long> {
    // Méthodes de recherche personnalisées si nécessaire
}
