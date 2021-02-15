package com.company;

public class Bastya extends Karakter{
    String nev;
    Bastya(String szin){
        super(szin);
        nev = "Bastya";
    }
    int[] validateRequestedMove(int[] requestedMove_X_Y){
        return requestedMove_X_Y;
    }

    boolean moveTo(int currentLocation_X, int currentLocation_Y,int wantedLocation_X, int wantedLocation_Y){
        return false;
    }
}
