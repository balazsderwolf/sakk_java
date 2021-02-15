package com.company;

import java.io.Console;

public class Game {
    Console console = System.console();
    public Karakter[][] table;
    Game(){
        System.out.println("Created a nwe game successfully");
        this.table = new Karakter[8][8];
    }

    void startNewGame(){
        // put Characters to the table
    }
    boolean validateInput(int x, int y){
        return x >= 0 && x <= 7 && y >= 0 && y <= 7 && !table[x][y].getColor().equals("none");
    }
    int[] requestInputFromUser(){
        //validate if this coordinate exist-> if not->loop
        // if yes->ask where to go

        int[] validUserInputAnswers = new int[2];
        int inputX;
        int inputY;
        boolean firstTry = true;
        do{
            if(!firstTry)
                System.out.println("Invalid coordinate, please try again (0-7)%n");
            inputX = Integer.parseInt(console.readLine("Horizontal location (x axis): "));
            inputY = Integer.parseInt(console.readLine("%nVertical location (y axis): "));
            firstTry = false;
        }while(!validateInput(inputX,inputY));
        validUserInputAnswers[0] = inputX;
        validUserInputAnswers[1] = inputY;

        return validUserInputAnswers;
    }

    void requestInputFromUserWhereToGo(){
        //if requestInputfromUser was successfull ask where to go
        //call characters moveTo method
        int[] locationCharacter = requestInputFromUser();
        System.out.println("%nWhere to move?%n");
        boolean firstTry = true;
        int inputWhere_X;
        int inputWhere_Y;
        do {
            if(!firstTry)
                System.out.println("Invalid coordinate, please try again (0-7)%n");
            inputWhere_X = Integer.parseInt(console.readLine("Horizontal location (x axis): "));
            inputWhere_Y = Integer.parseInt(console.readLine("%nVertical location (y axis): "));
            firstTry = false;
        }while(!table[locationCharacter[0]][locationCharacter[1]].moveTo(locationCharacter[0],
                locationCharacter[1],
                inputWhere_X,
                inputWhere_Y,
                table));
        //moveTo()-> validating the relation between the current location and wanted location for the specific character
        System.out.println("Excellent move:)%n");

    }

    void switchColor(){
        //after a successfully move-> next color's turn

    }
    void endGame(){
        //if checkmate or user want to quit->display winner and Goodby message

    }




}
