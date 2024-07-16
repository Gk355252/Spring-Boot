package com.codingshuttle.anuj.week1Introduction.IntroductionToSpringBoott;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
//@Service
public class Apple {
    void eatApple(){
        System.out.println("I am eating the apple");

    }


    @PostConstruct
    void callThisBeforeAppleIsUsed(){

        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    void callThisBeforeDestroy(){
        System.out.println("destroying the apple bean");

    }
}
