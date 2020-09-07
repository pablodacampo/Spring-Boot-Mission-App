package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
@Profile("insert")
public class InsererMission implements Runnable {
	private MissionRepository missionRepository;

	public InsererMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

//	@Override
//	public void run() {
//		Mission mission = new Mission();
//		mission.setLibelle("Mission 1");
//		mission.setTauxJournalier(new BigDecimal("100.90"));
//		mission.setDateDebut(LocalDate.of(2019, 1, 1));
//		mission.setDateFin(LocalDate.of(2019, 3, 4));
//		this.missionRepository.save(mission);
//	}

//	@Override
//	public void run() {
//		Mission mission = new Mission();
//		mission.setLibelle("Mission 2");
//		mission.setTauxJournalier(new BigDecimal("150.90"));
//		mission.setDateDebut(LocalDate.of(2019, 4, 4));
//		mission.setDateFin(LocalDate.of(2019, 6, 7));
//		this.missionRepository.save(mission);
//	}

//	@Override
//	public void run() {
//		Mission mission = new Mission();
//		mission.setLibelle("Mission 3");
//		mission.setTauxJournalier(new BigDecimal("200.90"));
//		mission.setDateDebut(LocalDate.of(2020, 1, 1));
//		mission.setDateFin(LocalDate.of(2020, 3, 4));
//		this.missionRepository.save(mission);
//	}

//	@Override
//	public void run() {
//		Mission mission = new Mission();
//		mission.setLibelle("Mission 4");
//		mission.setTauxJournalier(new BigDecimal("250.90"));
//		mission.setDateDebut(LocalDate.of(2020, 10, 10));
//		mission.setDateFin(LocalDate.of(2020, 12, 12));
//		this.missionRepository.save(mission);
//	}

	@Override
	public void run() {
		Mission mission = new Mission();
		mission.setLibelle("Mission 5");
		mission.setTauxJournalier(new BigDecimal("300.90"));
		mission.setDateDebut(LocalDate.of(2021, 1, 1));
		mission.setDateFin(LocalDate.of(2021, 3, 4));
		this.missionRepository.save(mission);
	}



}
