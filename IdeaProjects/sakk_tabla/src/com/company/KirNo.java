package com.company;

public class KirNo extends Karakter{
    String nev;
    KirNo(String szin){
        super(szin);
        nev = "Kiralyno";
    }

    int[] validateRequestedMove(int[] requestedMove_X_Y){
        return requestedMove_X_Y;
    }

    boolean moveTo(int currentLocation_X, int currentLocation_Y,int wantedLocation_X, int wantedLocation_Y){
        return false;
    }
}
