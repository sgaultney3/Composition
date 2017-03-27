package com.SamuelGaultney;

/**
 * Created by Samuel on 2/16/2017.
 */
public class Desk {

    private String model;
    private String height;
    private String color;

    public Desk(String model, String height, String color) {
        this.model = model;
        this.height = height;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
