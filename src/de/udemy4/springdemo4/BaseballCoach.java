package de.udemy4.springdemo4;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "\nThe Baseball trainer is German and said: 'Bitte Körbe üben, üben, üben! 2 Stunden!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	

	// Not done YET !!!!!!!!!!!!!!!!!!!
	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}


