package de.udemy4.springdemo4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPinting to the same object: " + result);
		
		System.out.println("\nMemory location for the Coach: " + theCoach);
		
		System.out.println("\nMemory location for the Coach: " + alphaCoach);
		
		// close the context
		context.close();
		
	}

}
