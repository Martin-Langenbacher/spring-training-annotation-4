package de.udemy4.springdemo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService") // --> now it it clear what Spring should use !!!
	private FortuneService fortuneService;
	
	
	// define a default contructor
		public SoccerCoach() {
			System.out.println(">> SoccerCoach: inside default constructor");
		}
	
	
	
	

	@Override
	public String getDailyWorkout() {
		return "Soccer Trainer said: 'Practice your running skills and run for an hour!";
	}

	@Override
	public String getDailyFortune() {
		return "--> " +fortuneService.getFortune();
	}

}





/*


//@Component("thatSillyCoach")  --> You can here put a specific bean-ID in; the default ID is tennisCoach for the Class "TennisCoach"!
@Component
public class TennisCoach implements Coach {
	
	// Field injection with '@Autowired'
	@Autowired
	@Qualifier("happyFortuneSerice") // --> now it it clear what Spring should use !!!
	private FortuneService fortuneService;
	
	// define a default contructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// works also with 'doSomeCrazyStuff'-Method ---> needs @Autowired !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}
	
	
	//==============================================================================================Setter injections with annotation !
	// step 1: define a setter method
	// step 2: add '
*/