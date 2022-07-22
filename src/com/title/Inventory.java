package com.title;

import java.util.Scanner;

public class Inventory {

    public static int apple = 2;
    public static int strawberry = 1;

    public void inventory(boolean enemy, boolean boss, boolean taskenemy){

        System.out.println("Ioann Health "+ Main.HIoann);

        System.out.println("\n-------------------------------\n");

        System.out.println("1: Apple "+apple);
        System.out.println("\n2: Strawberry "+strawberry);

        System.out.println("\n-------------------------------\n");

        System.out.println("3: Exit\n");

        final byte select = new Scanner(System.in).nextByte();

        switch (select){
            case 1:
                if(apple >= 1){
                    Main.ClearScreen();
                    Main.HIoann += 3;
                    apple -= 1;
                    inventory(enemy, boss, taskenemy);
                }

                else {
                    Main.ClearScreen();
                    inventory(enemy, boss, taskenemy);
                }
                break;

            case 2:

                if(strawberry >= 1){
                    Main.ClearScreen();
                    Main.HIoann += 7;
                    strawberry -= 1;
                    inventory(enemy, boss, taskenemy);
                }

                else {
                    Main.ClearScreen();
                    inventory(enemy, boss, taskenemy);
                }
                break;

            case 3:
                if(enemy == true){
                    Main.ClearScreen();
                    EGamePlay eGamePlay = new EGamePlay();
                    try {
                        eGamePlay.EFight();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                if (boss == true){
                    Main.ClearScreen();
                    BossSystem bossSystem = new BossSystem();
                    bossSystem.bossFight();
                }

                if(taskenemy == true){
                    Main.ClearScreen();
                    TaskSystem taskSystem = new TaskSystem();
                    taskSystem.taskFight();
                    break;
                }
                break;
        }
    }
}
