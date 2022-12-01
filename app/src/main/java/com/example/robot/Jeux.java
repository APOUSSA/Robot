package com.example.robot;

import java.util.Scanner;

public class Jeux {

    public static void main(String[] args) {

        int a;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenue dans mon jeux de robot");
            System.out.println("1. 1Joueur");
            System.out.println("2. 2Joueur");
            int k = sc.nextInt();

            while (k != 1 && k != 2) {
                System.out.println("Taper \1 ou \2");
                k = sc.nextInt();
            }

            switch (k) {

                case 1:
                    Scanner se = new Scanner(System.in);
                    Robot bob = new Robot();
                    Robot boss = new Robot("Rugal");
                    System.out.println("Entrer le nom de votre robot");
                    bob.setNom(se.nextLine());
                    System.out.println("FIGHT");
                    //boss.fire(bob);
                    break;

                case 2:
                    Scanner sp = new Scanner(System.in);
                    Robot bo = new Robot();
                    Robot bos = new Robot("");
                    System.out.println("Entrer le nom de votre robot 1");
                    bo.setNom(sp.nextLine());
                    System.out.println("Entrer le nom de votre robot 2");
                    bos.setNom(sp.nextLine());
                    System.out.println("FIGHT");
                    Arena nn = new Arena();
                    bo.Affiche();
                    bos.Affiche();
                    //nn.fight(bo,bos);
                    break;
            }

            Scanner po = new Scanner(System.in);
            System.out.println("Nouveau Jeu \0=oui \1=non");
            a = po.nextInt();

            while (a != 1 && a != 0)
                if (a == 0) {
                    System.out.println("Fin");
                }

        } while (a != 1) ;

    }

}
