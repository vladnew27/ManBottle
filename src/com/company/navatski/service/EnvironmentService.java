package com.company.navatski.service;

import com.company.navatski.model.environmrnt.Environment;
import com.google.gson.Gson;

public class EnvironmentService {

    public static String getStatus(Environment environment) {
        return new Gson().toJson(environment);
    }
}
