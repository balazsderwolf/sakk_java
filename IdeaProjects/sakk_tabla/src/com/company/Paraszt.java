package com.company;

public class Paraszt extends Karakter {
    String nev;
    Paraszt(String szin){
        super(szin);
        nev = "Paraszt";
    }

    boolean validateRequestedMove(int currentLocation_X, int currentLocation_Y,int wantedLocation_X, int wantedLocation_Y,Karakter[][] table){

        return false;
    }
    boolean moveTo(int currentLocation_X, int currentLocation_Y,int wantedLocation_X, int wantedLocation_Y, Karakter[][] table){

        return false;
    }


}
