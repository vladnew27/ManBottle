package com.company.navatski.view;

public class TextGenerator {
    //данный класс (возврат необзодимы текство лучше реализовать отдельный файлом/ ресурсом)
    // + можно сделать многоязычность
    public static String getWelcomeText(){
        return "Hello \n" +
                "this is application which describes the process of drinking liquid \n" +
                "let's begin our simulation \n" ;
    }
    public static String askInputText(){
        return "Please  enter command. for more information enter HELP";

    }

}
