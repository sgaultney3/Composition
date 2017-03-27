package com.SamuelGaultney;

/**
 * Created by Samuel on 2/16/2017.
 */
public class Bed {

    private Pillow isPillow;  //smaller part of a composition of a bed
    private String mattressType;
    private int softLevel;

    public Bed(Pillow isPillow, String mattressType, int softLevel) {
        this.isPillow = isPillow;
        this.mattressType = mattressType;
        this.softLevel = softLevel;
    }

    public void fluff(int softLevel) {
        System.out.println("Pillow is fluffed to level " + softLevel);
    }

    public Pillow getIsPillow() {
        return isPillow;
    }

    public String getMattressType() {
        return mattressType;
    }

    public int getSoftLevel() {
        return softLevel;
    }
}
