package com.company.navatski.spring;

import com.company.navatski.model.mammal.Cat;
import com.company.navatski.model.mammal.Man;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.company.navatski")
public class ManBottleConfig {

    @Bean
    public Cat cat2() {
        Cat cat2 = new Cat();

        cat2.setName("Murzik_JavaClassConfig");
        cat2.setStomachVolume(150.0);
        return cat2;
    }

    @Bean
    public Cat cat() {
        Cat cat = new Cat();

        cat.setName("Barsik_JavaClassConfig");
        cat.setStomachVolume(200.0);
        return cat;
    }

    @Bean(name = "man")
    public Man manBean() {
        Man man = new Man();
        man.setName("Bob_JavaClassConfig");
        man.setStomachVolume(1000.0);
        man.setPet(cat2());
        return man;
    }

    @Bean
    public Man man2() {
        Man man = new Man();
        man.setName("Amy_JavaClassConfig");
        man.setStomachVolume(800.0);
        man.setPet(cat());
        return man;
    }
}
