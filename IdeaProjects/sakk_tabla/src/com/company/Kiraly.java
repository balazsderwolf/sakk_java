package com.company;

public class Kiraly extends Karakter{
    String nev;
    Kiraly(String szin){
        super(szin);
        nev = "Kiraly";
    }

    int[] validateRequestedMove(int[] requestedMove_X_Y){
        return requestedMove_X_Y;
    }
    boolean moveTo(int currentLocation_X, int currentLocation_Y,int wantedLocation_X, int wantedLocation_Y){
        return false;
    }
}
