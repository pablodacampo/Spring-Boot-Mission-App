package dev.mission.exec;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.mission.MissionAppApplication;
import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
@Profile("nextMissions")
public class ListerProchainesMissions implements Runnable {
	
	private MissionRepository missionRepository;
	
	private static final Logger LOG = LoggerFactory.getLogger(MissionAppApplication.class);
	
	public ListerProchainesMissions(MissionRepository missionRepository) {
		
		this.missionRepository = missionRepository;
	}
	
	@Override
	public void run() {
		List<Mission> listMissions = missionRepository.nextMissions();
		
		if (listMissions.isEmpty()) {
			
			LOG.warn("No Missions for this Search!");
			
		}	else {
			
			
			for(
			Mission mission:listMissions)
			{
		
			LOG.info("id={} libelle={} dateDebut={} dateFin={} tauxJournalier={}",
						mission.getId(), mission.getLibelle(), mission.getDateDebut(), mission.getDateFin(), mission.getTauxJournalier());
		
			}
			
		}
	
	}

}
