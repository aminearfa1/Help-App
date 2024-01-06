package fr.insa.mission.service;

import fr.insa.mission.model.Mission;
import fr.insa.mission.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MissionService {

    private final MissionRepository missionRepository;

    @Autowired
    public MissionService(MissionRepository missionRepository) {
        this.missionRepository = missionRepository;
    }

    public Mission createMission(Mission mission) {
        // Votre logique de création de mission ici
        return missionRepository.save(mission);
    }

    public Mission validerMission(Long missionId) {
        // Votre logique de validation de mission ici
        // Assurez-vous de définir le statut de validation et de gérer le motif de non-validation si nécessaire
        return null; // Remplacez par la logique appropriée
    }

    public Mission getMission(Long missionId) {
        // Votre logique pour obtenir une mission par son ID ici
        return missionRepository.findById(missionId).orElse(null);
    }
}
