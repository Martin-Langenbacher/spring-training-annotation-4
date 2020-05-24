package de.udemy4.springdemo4;

import org.springframework.stereotype.Component;

@Component("fooMartin") // the automation of the name does not work when the second letter is also a capital letter - as the 'E' in RESTFortune...
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Hier steht noch nichts drin !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
	}

}
