package com.title;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class TaskSystem {

    public void taskSelect(){

        System.out.println("Ioann Health: "+Main.HIoann);

        System.out.println("\n1: No Die!");
        System.out.println("\n2: Run away from death");

        System.out.println("\n\n3: Exit");

        final byte select = new Scanner(System.in).nextByte();

        switch (select){
            case 1:
                Main.HIoann = 40;
                Main.HEnemy = 100;
                Main.DEnemy = 10;
                Main.ClearScreen();
                taskFight();
                break;
            case 2:
                Main.ClearScreen();
                taskRun();
                break;

            case 3:
                Main.ClearScreen();
                Game game = new Game();
                game.LActive = true;
                try {
                    try {
						game.LGameplay("Fu!@ YEA!");
					} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
    }

    private void taskRun() {
    }

    public void taskFight() {
        Inventory inventory = new Inventory();
        Main main = new Main();
        OptionClass os = new OptionClass();

        if(Main.HIoann <= 0){
            Main.ClearScreen();
            DieScreen ds = new DieScreen();
            try {
                ds.DScreen();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        else if(Main.HEnemy <= 0){
            Main.ClearScreen();
            System.out.println("1: Next");
            System.out.println("\n2: Pray");

            final byte WSelect = new Scanner(System.in).nextByte();

            switch (WSelect){
                case 1:
                    inventory.apple+= 15;
                    inventory.strawberry += 10;
                    Main.ClearScreen();
                    Main.point += 45;
                    taskSelect();
                    break;

                case 2:
                    Main.ClearScreen();
                    inventory.apple+= 25;
                    inventory.strawberry += 15;
                    Main.point += 75;
                    taskSelect();
                    break;
            }
        }

        System.out.println("Enemy Health: "+Main.HEnemy);
        System.out.println("\n Ioann Health: "+Main.HIoann);
        System.out.println("\n-------------------------\n");
        System.out.println("1: Fight");
        System.out.println("2: Statistic");
        System.out.println("3: Inventory");

        final byte ESelect = new Scanner(System.in).nextByte();

        switch (ESelect){
            case 1:
                main.ClearScreen();
                Main.HEnemy -= Main.DIoann;
                System.out.println("Your take damgae: "+Main.DIoann);
                System.out.println("\n1: Next");

                final byte FSelect = new Scanner(System.in).nextByte();

                switch (FSelect){
                    case 1:
                        main.ClearScreen();
                        Main.HIoann -= Main.DEnemy;
                        System.out.println("Health Ioann: "+Main.HIoann);
                        System.out.println("\nHealth -"+Main.DEnemy);
                        System.out.println("1: Next");
                        final byte FSelect2 = new Scanner(System.in).nextByte();

                        switch (FSelect2){
                            case 1:
                                Main.ClearScreen();
                                taskFight();
                                break;
                        }
                        break;
                }

            case 2:
                Main.ClearScreen();
                Statistic stat = new Statistic();
                try {
                    stat.SLogic(false, false, true, false);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;

            case 3:
                Main.ClearScreen();
                inventory.inventory(false, false, true);
                break;
        }
    }


}
