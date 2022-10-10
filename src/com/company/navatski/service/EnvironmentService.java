package com.company.navatski.service;

import com.company.navatski.model.environmrnt.Environment;
import com.company.navatski.model.environmrnt.EnvironmentSingleton;
import com.google.gson.Gson;

public class EnvironmentService {
    Environment environment;

    public EnvironmentService() {
        this.environment = EnvironmentSingleton.getInstance();
    }

    public String doSimulation() {
        environment.getMammal().drink(environment.getItem());
        return "Simulation done";
    }

    public String getStatus() {
        return new Gson().toJson(environment);
    }
}
