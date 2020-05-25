package de.udemy4.springdemo4;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach2 implements Coach {
	
	private FortuneService fortuneService;
	
	// field level injection
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach2(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up, says the SwimCoach2 !!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return "This is the getEmailAddress-Part: " + email;
	}

	

}
