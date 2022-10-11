package com.company.navatski.spring;

import com.company.navatski.model.item.Glass;
import com.company.navatski.model.item.Item;
import com.company.navatski.model.mammal.Cat;
import com.company.navatski.model.mammal.Mammal;
import com.company.navatski.model.mammal.Man;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MainSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/company/navatski/spring/beans.xml");
//        Mammal mammal = context.getBean("man", Man.class);
//        System.out.println(mammal.toString());
//        mammal = context.getBean("man2", Man.class);
//        System.out.println(mammal.toString());
//        mammal = context.getBean("cat", Cat.class);
//        System.out.println(mammal.toString());
        Item item = context.getBean("glass", Glass.class);
        System.out.println(item.toString());

       context.getBeansOfType(Mammal.class).forEach((k,v)-> v.drink(item) );
    }
}