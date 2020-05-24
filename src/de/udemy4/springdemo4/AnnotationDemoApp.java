package de.udemy4.springdemo4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container (now with default - not like down with another name!!!)
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// Default BEAN-ID:
		//-------------------------<<<
		// we put here the NOT default bean-ID "thatSillyCoach" in!  --> You can here put a specific bean-ID in; the default ID is tennisCoach for the Class "TennisCoach"!
		// Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		
		// call a method on the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		
		
		//=====================================================================================================
		// soccer & baseball:
		
		
		// get the bean from spring container (default name)
		Coach theSoccerCoach = context.getBean("soccerCoach", Coach.class);
		Coach theBaseballCoach = context.getBean("baseballCoach", Coach.class);
		Coach theGolfCoach = context.getBean("sebastianTheCoach", Coach.class);
		
		
		
		
		
		// call a method on the bean 
		System.out.println(theSoccerCoach.getDailyWorkout());
		System.out.println(theBaseballCoach.getDailyWorkout());
		System.out.println(theGolfCoach.getDailyWorkout());
		
		
		// close the context
		context.close();
		
	}

}



