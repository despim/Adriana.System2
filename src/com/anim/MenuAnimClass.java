package com.anim;

import com.title.Main;

public class MenuAnimClass {

    private static int FPSCountM;
    public static void MAnim() {
        Main main = new Main();
        switch (FPSCountM){
            case 1:
                main.ClearScreen();
                System.out.println("|");
                break;
            case 2:
                main.ClearScreen();
                System.out.println("S|");
                break;
            case 3:
                main.ClearScreen();
                System.out.println("St");
                break;
            case 4:
                main.ClearScreen();
                System.out.println("Sta|");
                break;
            case 5:
                main.ClearScreen();
                System.out.println("Star");
                break;
            case 6:
                main.ClearScreen();
                System.out.println("Start|");
                break;
            case 7:
                main.ClearScreen();
                System.out.println("Start G");
                break;
            case 9:
                main.ClearScreen();
                System.out.println("Start Ga|");
                break;
            case 10:
                main.ClearScreen();
                System.out.println("Start Gam");
                break;
            case 11:
                main.ClearScreen();
                System.out.println("Start Game|");
                break;
            case 12:
                main.ClearScreen();
                System.out.println("Start Game ");
                break;
            case 13:
                main.ClearScreen();
                System.out.println("Start Game |");
                break;
            case 14:
                main.ClearScreen();
                System.out.println("Start Game ");
                break;
            case 15:
                main.ClearScreen();
                break;
        }
        FPSCountM+=1;
    }
}
