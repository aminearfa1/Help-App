package fr.insa.mission.controller;

import fr.insa.mission.model.Mission;
import fr.insa.mission.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missions")
public class MissionController {

    private final MissionService missionService;

    @Autowired
    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @PostMapping
    public Mission createMission(@RequestBody Mission mission) {
        return missionService.createMission(mission);
    }

    @PutMapping("/{missionId}/valider")
    public Mission validerMission(@PathVariable Long missionId) {
        return missionService.validerMission(missionId);
    }

    @GetMapping("/{missionId}")
    public Mission getMission(@PathVariable Long missionId) {
        return missionService.getMission(missionId);
    }
}
