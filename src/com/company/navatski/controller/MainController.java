package com.company.navatski.controller;

public final class MainController {
    //create
    //simulate man drinking
    private String[] request;
    private String[] response;
    private static volatile MainController instance;

    private MainController() {
    }

    public static MainController getInstance(String value) {
        MainController result = instance;
        if (result != null) {
            return result;
        }
        synchronized (MainController.class) {
            if (instance == null) {
                instance = new MainController();
            }
            return instance;
        }
    }

}
