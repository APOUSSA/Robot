package com.example.robot;

public class Main {

    public static void main(String [] args){

        Robot bob= new Robot("bob");
        Arena boss= new Arena();
        bob.Affiche();
        boss.fight("bob","Rugal");
    }

}
