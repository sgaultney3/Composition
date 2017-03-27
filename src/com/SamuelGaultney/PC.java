package com.SamuelGaultney;

/**
 * Created by Samuel on 2/16/2017.
 */
public class PC {

    private Case theCase; //this is the composition aspect, PC is comprised of these other classes
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //Fancy graphics
        getMonitor().drawPixelAt(1500, 700, "yellow");
    }
    private Case getTheCase() {  //revert these getters back to public
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
