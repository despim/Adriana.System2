package com.title;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class DieScreen {

    public void DScreen() throws InterruptedException {
        System.out.println("HMMM TRY AGAIN");

        Thread.sleep(10);

        System.out.println("\n1: Try Again :o\n");

        final byte SDscreen = new Scanner(System.in).nextByte();

        switch (SDscreen){
            case 1:
                Game game = new Game();
                Main.HIoann = 0;

                Main.DIoann = 0;

                Main.HEnemy = 0;

                Main.DEnemy = 0;

                Main.NLevel = "";

                Main.percent = 0;

                Main.point = 0;

                Main.km = 0;

                Main.luck = 120;

                Main.HBoss = 0;

                Main.DBoss = 0;
                LoadingSystem loadingSystem = new LoadingSystem();
			try {
				loadingSystem.loading();
			} catch (InterruptedException | LineUnavailableException | UnsupportedAudioFileException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                break;
        }
    }
}
