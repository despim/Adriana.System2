package com.title;

import javax.sound.sampled.LineUnavailableException;
import java.io.IOException;
import java.util.Scanner;

public class OptionClass {
    public boolean isOption = false;

    public boolean isSFX = true;
    public boolean isMusic = true;


    public void GOption() throws InterruptedException{
        while(isOption){
            Main main = new Main();
            main.ClearScreen();
            System.out.println("1: Sound Option");
            System.out.print("\t2: Exit");
            final byte SOption = new Scanner(System.in).nextByte();

            if(SOption == 1) {
                SoundOptions();
            }

            if(SOption == 2){
                MainMenu mm = new MainMenu();
                isOption = false;
                mm.isMenu = true;
                mm.menu();
            }
        }
    }

    private void SoundOptions() throws InterruptedException{
        Main main = new Main();
        Main.ClearScreen();
        System.out.println("SFX: "+ isSFX);
        System.out.println("Music: "+isMusic);

        final byte SSound = new Scanner(System.in).nextByte();

        switch (SSound){
            case 1:
                System.out.println("1: True");
                System.out.println("2: False");
                final byte STrueFalse = new Scanner(System.in).nextByte();

                switch (STrueFalse){
                    case 1:
                        main.ClearScreen();
                        isSFX = true;
                        GOption();
                        break;

                    case 2:
                        main.ClearScreen();
                        isSFX = false;
                        GOption();
                        break;
                }
            case 2:
                System.out.println("1: True");
                System.out.println("2: False");

                final byte STrueFalse2 = new Scanner(System.in).nextByte();

                switch (STrueFalse2){
                    case 1:
                        main.ClearScreen();
                        isMusic = true;
                        GOption();
                        break;
                    case 2:
                        main.ClearScreen();
                        isMusic = false;
                        GOption();
                        break;
                }
                break;
        }
    }
}
