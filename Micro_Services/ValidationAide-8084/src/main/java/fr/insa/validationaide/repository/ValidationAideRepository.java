package fr.insa.validationaide.repository;

import fr.insa.validationaide.model.ValidationAide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationAideRepository extends JpaRepository<ValidationAide, Long> {
    // Méthodes de recherche personnalisées si nécessaire
}
