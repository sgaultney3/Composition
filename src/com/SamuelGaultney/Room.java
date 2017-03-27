package com.SamuelGaultney;

/**
 * Created by Samuel on 2/16/2017.
 */
public class Room {

    private Bed theBed;  //Composition of parts of a room
    private Heater theHeater;
    private Desk theDesk;

    public Room(Bed theBed, Heater theHeater, Desk theDesk) {
        this.theBed = theBed;
        this.theHeater = theHeater;
        this.theDesk = theDesk;
    }

    public void activateRoom(Heater theHeater) {
        getTheHeater().turnOn("45JD-5");
    }

    public void testBed(Bed theBed) {
        getTheBed().fluff(7);
    }

    public Bed getTheBed() {
        return theBed;
    }

    public Heater getTheHeater() {
        return theHeater;
    }

    public Desk getTheDesk() {
        return theDesk;
    }
}
