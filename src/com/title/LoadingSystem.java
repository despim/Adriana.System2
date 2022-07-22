package com.title;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class LoadingSystem {

    private byte FPSCount;


    //Loading System
    public void loading() throws InterruptedException, LineUnavailableException, UnsupportedAudioFileException, IOException{
        for(int i = 0; i<8; i++){
            LAnim();
            Thread.sleep(350);
        }
        Game game = new Game();
        game.LActive = true;
				game.LGameplay("Start New Game");
			
    }


    // Anim loading
    private void LAnim(){
        Main main = new Main();
        switch (FPSCount){
            case 1:
                main.ClearScreen();
                System.out.println("Loading: /");
                Main.HIoann = 100;
                Main.DIoann = 6;
                break;
            case 3:
                main.ClearScreen();
                System.out.println("Loading: -");
                Main.HEnemy = 15;
                Main.DEnemy = 3;
                break;
            case 5:
                main.ClearScreen();
                System.out.println("Loading: \\");
                Main.NLevel = "Sersonatus: The City Capital";
                break;
            default:
                main.ClearScreen();
                System.out.println("Loading: |");
                break;
        }
        FPSCount++;
    }
}
