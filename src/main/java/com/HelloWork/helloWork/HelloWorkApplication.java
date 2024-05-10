package com.HelloWork.helloWork;

import com.HelloWork.helloWork.Class.SecondClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWorkApplication {

    public static void main( String[] args ) {
        SpringApplication.run(HelloWorkApplication.class, args);
    }

    @Bean
    public SecondClass getSecondClass() {
        return new SecondClass();
    }
}
