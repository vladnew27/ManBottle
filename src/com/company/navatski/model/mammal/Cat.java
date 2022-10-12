package com.company.navatski.model.mammal;

public class Cat extends Mammal implements Drinking ,Petable{
    public Cat(String name, double stomachVolume) {
        super(name, stomachVolume);
    }
    //    @Override
//    public void drink(Drinkable drinkable) {
//        System.out.println(this.getName() + " lapping up from "+ drinkable.getClass().getSimpleName()); // коты не пьют, а лакают:)
//    }

    @Override
    public String getAction() {
        return " lapping up from ";
    }
}
