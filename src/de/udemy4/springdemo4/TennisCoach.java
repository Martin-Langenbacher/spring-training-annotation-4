package de.udemy4.springdemo4;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")  --> You can here put a specific bean-ID in; the default ID is tennisCoach for the Class "TennisCoach"!
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}


