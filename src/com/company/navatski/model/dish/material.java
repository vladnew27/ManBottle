package com.company.navatski.model.dish;

public enum material {
    // release2
    GLASS(200.0),
    PLASTIC(70.0);

    private final double damageTemperature;

    material(double damageTemperature) {
        this.damageTemperature=damageTemperature;
    }

    public double getDamageTemperature() {
        return damageTemperature;
    }
}
