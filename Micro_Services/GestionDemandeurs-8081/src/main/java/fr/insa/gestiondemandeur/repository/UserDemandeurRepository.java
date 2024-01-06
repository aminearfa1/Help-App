package fr.insa.gestiondemandeur.repository;

import fr.insa.gestiondemandeur.model.UserDemandeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDemandeurRepository extends JpaRepository<UserDemandeur, Long> {
    // Vous pouvez ajouter des méthodes de recherche personnalisées si nécessaire
}
