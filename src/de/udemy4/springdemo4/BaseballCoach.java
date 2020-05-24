package de.udemy4.springdemo4;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "\nThe Baseball trainer is German and said: 'Bitte Körbe üben, üben, üben! 2 Stunden!";
	}

}


