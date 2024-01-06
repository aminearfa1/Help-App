package fr.insa.mission.repository;

import fr.insa.mission.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {
    // Vous pouvez ajouter des méthodes de recherche personnalisées ici si nécessaire
}
