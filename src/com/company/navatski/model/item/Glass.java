package com.company.navatski.model.item;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("glass")
public class Glass extends Item implements Drinkable{

    public Glass( @Value("233.0") double volume) {
        super(volume);
       // System.out.println("Glass constructor invoked");
    }
}
