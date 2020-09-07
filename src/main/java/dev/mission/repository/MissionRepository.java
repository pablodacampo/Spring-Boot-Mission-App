package dev.mission.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.mission.entite.Mission;

public interface MissionRepository extends JpaRepository<Mission, Integer> {

    @Query("SELECT m FROM Mission m WHERE m.dateDebut >= NOW()")
    List<Mission> nextMissions();
    
	@Query("SELECT m FROM Mission m WHERE m.dateDebut >= NOW() AND m.tauxJournalier >= 200")
	List<Mission> nextMissionsTJM();

}

