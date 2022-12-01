package com.example.robot;

import java.util.Scanner;

public class Robot {

    protected String nom;
    protected int Point_de_vie;

    public Robot(){
        nom="";
        Point_de_vie=10;
    }

    public Robot(String n, int p) {
        this.nom=n;
        this.Point_de_vie=p;
    }

    public Robot(String bob) {
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }

    public int getPoint_de_vie() {
        return Point_de_vie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPoint_de_vie(int point_de_vie) {
        Point_de_vie = point_de_vie;
    }

    public void Affiche(){
        System.out.println("Robot" + this.nom);
    }

    public void fire(String nom) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tape la touche \5 et le robot " +nom+ " bombarde le robot " +this.nom );
        Point_de_vie=10;

        do{
            int b=sc.nextInt();
            while (b!=0){
                System.out.println("Veuillez taper la touche \5 ");
                b=sc.nextInt();
            }
            System.out.println("Le robot " +this.nom+ " a été touché par le robot " +nom);
            Point_de_vie=Point_de_vie -2;
        } while (Point_de_vie > 0);
    }

    public void isDead() {
        if(this.Point_de_vie==0){
            System.out.println("Le robot " +this.nom+ " est mort");
        }
    }

}
