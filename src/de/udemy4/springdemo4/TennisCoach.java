package de.udemy4.springdemo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")  --> You can here put a specific bean-ID in; the default ID is tennisCoach for the Class "TennisCoach"!
@Component
//@Scope("prototype") // prototype: Creates a new instance every time!
public class TennisCoach implements Coach {
	
	// Field injection with '@Autowired'
	@Autowired
	@Qualifier("happyFortuneSerice") // --> now it it clear what Spring should use !!!
	private FortuneService fortuneService;
	
	// define a default contructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	
	
	// ==> does not work with newer Java-Versions:
	
	/*
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	
	// define my destroy method
		@PreDestroy
		public void doMyCleanupStuff() {
			System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
		}
	*/
	
	
	
	
	
	
	// works also with 'doSomeCrazyStuff'-Method ---> needs @Autowired !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}
	*/
	
	//==============================================================================================Setter injections with annotation !
	// step 1: define a setter method
	// step 2: add '@Autowired'
	
	/* out because of 'doSomeCrazyStuff'-Method'
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		fortuneService = theFortuneService;
	}
	*/
	
	
	/*
	// constructor with auto-injection
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	//==============================================================================================Setter injections with annotation --- Ende!
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
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


