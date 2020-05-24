package de.udemy4.springdemo4;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneSerice implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day - as every day!!!";
	}

}
