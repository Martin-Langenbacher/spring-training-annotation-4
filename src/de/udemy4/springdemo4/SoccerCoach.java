package de.udemy4.springdemo4;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "\nSoccer Trainer said: 'Practice your running skills and run for an hour!";
	}

}

