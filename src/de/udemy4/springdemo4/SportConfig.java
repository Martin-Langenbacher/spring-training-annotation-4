package de.udemy4.springdemo4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("de.udemy4.springdemo4")  // --> out in chapter 89 !
@PropertySource("classpath:sport.properties2")
public class SportConfig {
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency

	@Bean
	public Coach swimCoach2() {
		return new SwimCoach2(sadFortuneService());
	}
	// we inject the sadFortune by using the same "word" in line 13 and 21: --> sadFortuneService
	
}
