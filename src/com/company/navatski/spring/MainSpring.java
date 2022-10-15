package com.company.navatski.spring;

import com.company.navatski.model.item.Glass;
import com.company.navatski.model.item.Item;
import com.company.navatski.model.mammal.Cat;
import com.company.navatski.model.mammal.Mammal;
import com.company.navatski.model.mammal.Man;
//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    private static final Logger logger = LogManager.getLogger(MainSpring.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ManBottleConfig.class);
        Mammal mammal = context.getBean("man", Man.class);
        // System.out.println(mammal.toString());
        logger.info(mammal.toString());
        mammal = context.getBean("man2", Man.class);
        logger.info(mammal.toString());
        mammal = context.getBean("cat", Cat.class);
        logger.info(mammal.toString());
        Item item = context.getBean("glass", Glass.class);
        logger.info(item.toString());
        context.getBeansOfType(null).forEach((k, v) -> logger.info(k));
        context.getBeansOfType(Mammal.class).forEach((k, v) -> v.drink(item));
        context.close();
    }
}
