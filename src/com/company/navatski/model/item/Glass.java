package com.company.navatski.model.item;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("glass")
public class Glass extends Item implements Drinkable{

    public Glass( @Value("233.0") double volume) {
        super(volume);
       // System.out.println("Glass constructor invoked");
    }
    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct invoked");
    }
    @PreDestroy
    public void brakeGlass(){
        System.out.println("@PreDestroy invoked");
        System.out.println("glass is broken");
    }
}
