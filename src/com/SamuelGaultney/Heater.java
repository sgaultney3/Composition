package com.SamuelGaultney;

/**
 * Created by Samuel on 2/16/2017.
 */
public class Heater {

    private String color;
    private String model;

    public Heater(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public void turnOn(String model) {
        System.out.println("The heater is on");
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
