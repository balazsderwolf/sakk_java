package com.company;

public class Lo extends Karakter{
    String nev;
    Lo(String szin){
        super(szin);
        nev = "Lo";
    }

    int[] validateRequestedMove(int[] requestedMove_X_Y){
        return requestedMove_X_Y;
    }
    boolean moveTo(int currentLocation_X, int currentLocation_Y,int wantedLocation_X, int wantedLocation_Y){
        return false;
    }
}
