package com.title;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class upgrade {

    public void Upgrade() throws InterruptedException {
        Main main = new Main();

        System.out.println("1: Health 65 point");
        System.out.println("2: Damage 85 point");
        System.out.println("\n------------------\n");
        System.out.println("3: Exit\n");

        final byte SUpgrade = new Scanner(System.in).nextByte();

        switch (SUpgrade){
            case 1:
                if(Main.point >= 65){
                    main.ClearScreen();
                    System.out.println("1: Yes");
                    System.out.println("\n2: No");

                    final byte SSUpgrade = new Scanner(System.in).nextByte();

                    switch (SSUpgrade){
                        case 1:
                            try{
                                OptionClass os = new OptionClass();
                                File sound = new File("Audio/SFX/powerUp.wav");

                                AudioInputStream Ais = AudioSystem.getAudioInputStream(sound);

                                Clip _clip = AudioSystem.getClip();

                                if (os.isSFX) {
                                    _clip.open(Ais);
                                    _clip.setFramePosition(0);
                                    _clip.start();
                                }

                                Main.HIoann += 25;
                                Main.point -= 65;
                                main.ClearScreen();
                                Upgrade();
                            }
                            catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
                                exc.printStackTrace();
                            }
                        break;
                    }
                }

                else {
                    try{
                        OptionClass os = new OptionClass();
                        File sound = new File("Audio/SFX/ERROR.wav");

                        AudioInputStream Ais = AudioSystem.getAudioInputStream(sound);

                        Clip _clip = AudioSystem.getClip();

                        if (os.isSFX) {
                            _clip.open(Ais);
                            _clip.setFramePosition(0);
                            _clip.start();
                        }
                        main.ClearScreen();
                        System.out.println("Error");
                        System.out.println("\n1: Next");

                        final byte scan = new Scanner(System.in).nextByte();

                        switch (scan){
                            case 1:
                                main.ClearScreen();
                                Upgrade();
                                break;
                        }

                    }
                    catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
                        exc.printStackTrace();
                    }
                }
                break;
                
                
                
            case 2:
                if(Main.point >= 85){
                    main.ClearScreen();
                    System.out.println("1: Yes");
                    System.out.println("\n2: No");

                    final byte SSUpgrade = new Scanner(System.in).nextByte();

                    switch (SSUpgrade){
                        case 1:
                            try{
                                OptionClass os = new OptionClass();
                                File sound = new File("Audio/SFX/powerUp.wav");

                                AudioInputStream Ais = AudioSystem.getAudioInputStream(sound);

                                Clip _clip = AudioSystem.getClip();

                                if (os.isSFX) {
                                    _clip.open(Ais);
                                    _clip.setFramePosition(0);
                                    _clip.start();
                                }

                                Main.DIoann += 15;
                                Main.point -= 85;
                                main.ClearScreen();
                                Upgrade();
                            }
                            catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
                                exc.printStackTrace();
                            }
                        break;
                    }
                }

                else {
                    try{
                        OptionClass os = new OptionClass();
                        File sound = new File("Audio/SFX/ERROR.wav");

                        AudioInputStream Ais = AudioSystem.getAudioInputStream(sound);

                        Clip _clip = AudioSystem.getClip();

                        if (os.isSFX) {
                            _clip.open(Ais);
                            _clip.setFramePosition(0);
                            _clip.start();
                        }
                        main.ClearScreen();
                        System.out.println("Error");
                        System.out.println("\n1: Next");

                        final byte scan = new Scanner(System.in).nextByte();

                        switch (scan){
                            case 1:
                                main.ClearScreen();
                                Upgrade();
                                break;
                        }

                    }
                    catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
                        exc.printStackTrace();
                    }
                }
                break;   

            case 3:
                main.ClearScreen();
                Game game = new Game();
                game.LActive = true;
			try {
				game.LGameplay("Fuck yea");
			} catch (InterruptedException | LineUnavailableException | UnsupportedAudioFileException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                break;
        }
    }
}
