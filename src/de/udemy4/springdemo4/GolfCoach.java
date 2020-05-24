package de.udemy4.springdemo4;

import org.springframework.stereotype.Component;

@Component("sebastianTheCoach")
public class GolfCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "\nSebastian said (again in German): '1000 Abschläge machen!'";
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


