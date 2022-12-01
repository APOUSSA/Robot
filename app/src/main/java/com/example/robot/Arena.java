package com.example.robot;

import java.util.Scanner;

public class Arena extends Robot {

    protected  int Point_de_vie_2;

    public Arena(){
        nom="";
        Point_de_vie=10;
    }
    public Arena (String n, int p) {
        this.nom=n;
        this.Point_de_vie=p;
    }

    public int getPoint_de_vie_2() {
        return Point_de_vie_2;
    }

    public void setPoint_de_vie_2(int p2) {
        Point_de_vie_2 = p2;
    }
    public void fight (String nom, String nom2){
        Scanner sc=new Scanner(System.in);
        System.out.println("Taper \5 le robot " +nom+ " bombarde" +nom2);
        System.out.println("Taper \0 le robot " +nom+ " bombarde" +nom);
        Point_de_vie=10;
        Point_de_vie_2=10;

        do{
            int b=sc.nextInt();
            while (b!=5 && b!=0) {
                System.out.println("Taper la touche \5 ou \0");
                b=sc.nextInt();
            }
            if(b==0){
                System.out.println("Le robot " +nom2+ " est bombarder par le robot" +nom);
                Point_de_vie=Point_de_vie -2;
            }else{
                System.out.println("Le robot " +nom+ " est bombarder par le robot" +nom2);
                Point_de_vie_2=Point_de_vie_2 -2;
            }
        } while(Point_de_vie>0 && Point_de_vie_2>0);
        if(Point_de_vie==0) {
            System.out.println("Le robot " +nom2+ " est mort****");
        }else {
            System.out.println("Le robot " +nom+ " est mort");
        }
    }
}
