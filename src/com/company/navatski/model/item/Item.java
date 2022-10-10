package com.company.navatski.model.item;

public abstract class Item {
    private String type;
    private double radius;
    private double height;

    public Item(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
