package com.company;

public class Futo extends Karakter{
    String nev;
    Futo(String szin){
        super(szin);
        nev = "Futo";
    }

    int[] validateRequestedMove(int[] requestedMove_X_Y){
        return requestedMove_X_Y;
    }

    boolean moveTo(int currentLocation_X, int currentLocation_Y,int wantedLocation_X, int wantedLocation_Y){
        return false;
    }
}
