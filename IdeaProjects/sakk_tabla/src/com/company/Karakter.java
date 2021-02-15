package com.company;

public class Karakter {
    private String szin;

    Karakter(String szin){
        this.szin = szin;
    }
    boolean moveTo(int currentLocation_X,
                   int currentLocation_Y,
                   int wantedLocation_X,
                   int wantedLocation_Y,Karakter[][] table){
        System.out.println("Ganerated Problem-something went wrong, this is the superclass's moveTo");
        return false;
    }

    void setColor(String color){
        szin = color;
    }
    String getColor(){
        return szin;
    }
}
