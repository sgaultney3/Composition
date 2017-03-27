package com.SamuelGaultney;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");  //use these when PC getters are public
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();


        //Composition when putting things together, general rule is use composition first

        //inheritance is when you catergorize into smaller things vehicle->car->honda

        //Challenge Test (Room composition)
        Pillow thePillow = new Pillow(9);
        Bed theBed = new Bed(thePillow, "Water", 8); //base objects to create bedroom
        Desk theDesk = new Desk("IKEA", "7' 32\"", "Black");
        Heater littleHeater = new Heater("Black", "D006-24");

        Room theRoom = new Room(theBed, littleHeater, theDesk); //creating bedroom

        theRoom.activateRoom(littleHeater);
        theRoom.testBed(theBed);
        theRoom.getTheBed().fluff(8); //other way to call

    }
}
