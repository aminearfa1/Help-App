package fr.insa.avis.repository;

import fr.insa.avis.model.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Long> {
    // Méthodes personnalisées au besoin
}
