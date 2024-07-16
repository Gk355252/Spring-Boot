package com.codingshuttle.anuj.week1Introduction.IntroductionToSpringBoott;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigClass {

    @Bean
    @Scope("prototype")
    Apple getApple(){
        return new Apple();
    }
}
