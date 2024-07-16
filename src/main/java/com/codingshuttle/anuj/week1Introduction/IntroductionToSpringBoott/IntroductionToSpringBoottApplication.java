package com.codingshuttle.anuj.week1Introduction.IntroductionToSpringBoott;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
public class IntroductionToSpringBoottApplication implements CommandLineRunner {

	@Autowired
	Apple apple1;
	@Autowired
	Apple apple2;
	public static void main(String[] args) {

		SpringApplication.run(IntroductionToSpringBoottApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		// old style
//		Apple obj = new Apple();
//		obj.eatApple();

		// bean style
		apple1.eatApple();
		apple2.eatApple();
	}

}
