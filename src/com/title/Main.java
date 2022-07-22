package com.title;

import com.anim.PresentAnimClass;

import javax.sound.sampled.LineUnavailableException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    //Player statistic

    public static int HIoann;

    public static byte DIoann;


    //Enemy statistic

    public static byte HEnemy;

    public static byte DEnemy;



    //Level statistic

    public static String NLevel;

    public static byte percent;

    public static int point;

    public static int km;

    public static byte luck = 120;



    //Boss statistic

    public static int HBoss;

    public static byte DBoss;


    public static void main(String[] args) throws InterruptedException{
        ClearScreen();
        System.out.println("Please tell me why we live");
        Thread.sleep(290);
        System.out.println("\n1: Next");
        final byte select = new Scanner(System.in).nextByte();

        switch (select){
            case 1:
                ClearScreen();
                Thread.sleep(190);
                System.out.println(".........");
                Thread.sleep(290);
                System.out.println("\n1: Next");
                final byte select1 = new Scanner(System.in).nextByte();
                switch (select1){
                    case 1:
                        ClearScreen();
                        Thread.sleep(190);
                        System.out.println("You, like everything in this universe, everything is needed for something, so we all");
                        Thread.sleep(290);
                        System.out.println("\n1: Next");
                        final byte select2 = new Scanner(System.in).nextByte();
                        switch (select2){
                            case 1:
                                ClearScreen();
                                Thread.sleep(190);
                                System.out.println("What are we for?");
                                Thread.sleep(290);
                                System.out.println("\n1: Next");
                                final byte select3 = new Scanner(System.in).nextByte();
                                switch (select3){
                                    case 1:
                                        ClearScreen();
                                        Thread.sleep(190);
                                        System.out.println("I need you like native mother's children.....");
                                        Thread.sleep(290);
                                        System.out.println("\n1: Next");
                                        final byte select4 = new Scanner(System.in).nextByte();
                                        switch (select4){
                                            case 1:
                                                ClearScreen();
                                                Thread.sleep(190);
                                                System.out.println("And nobody needs me......");
                                                Thread.sleep(290);
                                                System.out.println("\n1: Next");
                                                final byte select5 = new Scanner(System.in).nextByte();
                                                switch (select5){
                                                    case 1:
                                                        Thread.sleep(390);
                                                        for(int i = 0; i<54; i+=1){
                                                            Thread.sleep(230);
                                                            PresentAnimClass.PresentAnim();
                                                            if(i >= 53){
                                                                Main.ClearScreen();
                                                                MainMenu mm = new MainMenu();
                                                                mm.StartAnim();
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public static void ClearScreen() {
        System.out.print("\033[H\033[J");
        System.out.flush();
    }
}