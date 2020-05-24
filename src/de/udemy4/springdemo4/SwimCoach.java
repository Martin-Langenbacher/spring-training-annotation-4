package de.udemy4.springdemo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class SwimCoach implements Coach {
	
	// Field injection with '@Autowired'
	@Autowired
	@Qualifier("randomFortuneService") // --> now it it clear what Spring should use !!!
	private FortuneService fortuneService;
	
	
	// add new fields for emailAddress and team
	@Value("${foo2.email}")
	private String emailAddress;
	
	@Value("${foo2.team}")
	private String team;
	
	
	// create a no-arg constructor
	public SwimCoach() {
	}

	
	

	
	@Override
	public String getDailyWorkout() {
		return "Swimmer(workout):  Dive a little ;-)";
	}
	

	@Override
	public String getDailyFortune() {
		return "Swimmer-fortune:   " + fortuneService.getFortune();
	}
	
	

	public String getTeam() {
		return "Team:              " + team;
	}



	public String getEmailAddress() {
		return "Email:             " + emailAddress;
	}
	

}

