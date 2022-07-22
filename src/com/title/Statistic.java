package com.title;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Statistic {

    public void SLogic(boolean LGame, boolean EGame, boolean TGame, boolean BGame) throws InterruptedException {

        Game game = new Game();

        System.out.println("Health: "+Main.HIoann);
        System.out.println("Damage: "+Main.DIoann);
        System.out.println("\n--------------------\n");
        System.out.println("Point: "+Main.point);
        System.out.println("KM: "+Main.km);

        System.out.println("\n1: Next\n");

        final byte SStat = new Scanner(System.in).nextByte();

        switch (SStat){
            case 1:
                if(LGame){
                    try {
                        OptionClass os = new OptionClass();
                        File sound = new File("Audio/SFX/select3.wav");

                        AudioInputStream Ais = AudioSystem.getAudioInputStream(sound);

                        Clip _clip = AudioSystem.getClip();

                        if (os.isSFX) {
                            _clip.open(Ais);
                            _clip.setFramePosition(0);
                            _clip.start();
                        }
                        game.LActive = true;
                        Thread.sleep(90);
                        game.LGameplay("Your exit statistic");
                        break;
                    }catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
                        exc.printStackTrace();
                    } catch (InterruptedException exc) {}
                }

               else if(EGame){
                    try {
                        OptionClass os = new OptionClass();
                        File sound = new File("Audio/SFX/select3.wav");

                        AudioInputStream Ais = AudioSystem.getAudioInputStream(sound);

                        Clip _clip = AudioSystem.getClip();

                        if (os.isSFX) {
                            _clip.open(Ais);
                            _clip.setFramePosition(0);
                            _clip.start();
                        }
                        Main.ClearScreen();
                        EGamePlay egp = new EGamePlay();
                        egp.EActive = true;
                        game.LActive = false;
                        Thread.sleep(90);
                        egp.EFight();
                        break;

                    }catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
                        exc.printStackTrace();
                    } catch (InterruptedException exc) {}
                } else if (TGame == true) {
                    Main.ClearScreen();
                    TaskSystem taskSystem = new TaskSystem();
                    Thread.sleep(100);
                    taskSystem.taskFight();
                }
               else if (BGame == true){
                   Main.ClearScreen();
                   BossSystem bossSystem = new BossSystem();
                   Thread.sleep(100);
                   bossSystem.bossFight();
                }
                break;
        }
    }
}
