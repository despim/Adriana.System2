package com.title;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ShopSystem {

    public void shop(){

        System.out.println("Point "+Main.point);

        System.out.println("\n1: Apple | 14 point");
        System.out.println("\n2: Strawberry | 24 point");
        System.out.println("\n3: Exit\n");

        final byte select = new Scanner(System.in).nextByte();

        switch (select){

            case 1:
                Main.ClearScreen();
                if(Main.point >= 14){
                    Inventory.apple+=3;
                    Main.ClearScreen();
                    Main.point-=14;
                    shop();
                }
                else {
                    Main.ClearScreen();
                    shop();
                }
                break;

            case 2:
                Main.ClearScreen();
                if(Main.point >= 24){
                    Inventory.strawberry+=3;
                    Main.ClearScreen();
                    Main.point-=24;
                    shop();
                }
                else {
                    Main.ClearScreen();
                    shop();
                }
                break;

            case 3:
                Main.ClearScreen();
                Game game = new Game();
                game.LActive = true;
                try {
                    try {
						game.LGameplay("Buy?");
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
}
