package de.udemy4.springdemo4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// >>1<<  read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// >>2<<  get the bean from spring container (now with default - not like down with another name!!!)
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// Default BEAN-ID:
		//-------------------------<<<
		// we put here the NOT default bean-ID "thatSillyCoach" in!  --> You can here put a specific bean-ID in; the default ID is tennisCoach for the Class "TennisCoach"!
		// Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		
		// >>3<<  call a method on the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		
		// >>4<<  call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		
		//=====================================================================================================
		// soccer & baseball.... 
		System.out.println("\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Additional from me <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		
		// get the bean from spring container (default name)
		Coach theSoccerCoach = context.getBean("soccerCoach", Coach.class);
		Coach theBaseballCoach = context.getBean("baseballCoach", Coach.class);
		Coach theGolfCoach = context.getBean("sebastianTheCoach", Coach.class);
		Coach theSwimCoach = context.getBean("swimCoach", Coach.class);
		
		
		
		
		// call a method on the bean 
		System.out.println(theSoccerCoach.getDailyWorkout());
		System.out.println(theSoccerCoach.getDailyFortune());
		System.out.println(theBaseballCoach.getDailyWorkout());
		System.out.println(theGolfCoach.getDailyWorkout());
		
		System.out.println("\n==================================> SwimCoach <==================================");
		System.out.println(theSwimCoach.getDailyWorkout());
		System.out.println(theSwimCoach.getDailyFortune());
		System.out.println(theSwimCoach.getEmailAddress());
		System.out.println(theSwimCoach.getTeam());
		
		// >>8x..<< close the context
		context.close();
		
	}

}



/*
// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean
		// ... let's come back to this ...
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// call our new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();

*/












