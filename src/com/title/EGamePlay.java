package com.title;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EGamePlay {

    File sound = new File("Audio/SFX/select2.wav");

    AudioInputStream Ais;

    Clip _clip;




    public boolean EActive = false;

    public void EFight() throws InterruptedException {
        while(EActive){
            Inventory inventory = new Inventory();
            OptionClass os = new OptionClass();

            if(Main.HIoann <= 0){
                Main.ClearScreen();
                Game.AudioLevel = 0;
                Game.clip.stop();
                Game.StartAudio = true;
                DieScreen ds = new DieScreen();
                ds.DScreen();
                break;
            }

            if(Main.HEnemy <= 0){
                Main.ClearScreen();
                System.out.println("1: Next");
                System.out.println("\n2: Pray");

                final byte WSelect = new Scanner(System.in).nextByte();

                switch (WSelect){
                    case 1:
                        Main.ClearScreen();
                        Main.luck = 100;
                        Main.percent+=2;
                        Main.point += 28;
                        TaskSystem taskSystem = new TaskSystem();
                        inventory.apple+= 3;
                        inventory.strawberry += 6;
                        EActive = false;
                        Game.LActive = true;
                     
					try {
						Game.LGameplay("Let's GO!");
					} catch (InterruptedException | LineUnavailableException | UnsupportedAudioFileException
							| IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                        break;

                    case 2:
                        Main.ClearScreen();
                        Main.luck = 123;
                        Main.percent+=2;
                        Main.point += 45;
                        inventory.apple += 15;
                        inventory.strawberry += 6;
                        Game.LActive = true;
                        EActive = false;
					try {
						Game.LGameplay("Good?");
					} catch (InterruptedException | LineUnavailableException | UnsupportedAudioFileException
							| IOException e) {
						e.printStackTrace();
					}
                        break;
                }
            }

                System.out.println("Enemy Health: "+Main.HEnemy);
                System.out.println("\nIoann Health: "+Main.HIoann);
                System.out.println("\n-------------------------\n");
                System.out.println("\n1: Fight");
                System.out.println("\n2: Statistic");
                System.out.println("\n3: Inventory\n");

            final byte ESelect = new Scanner(System.in).nextByte();

               switch (ESelect){
                case 1:

                    try{
                        Ais = AudioSystem.getAudioInputStream(sound);

                        _clip = AudioSystem.getClip();

                        if (os.isSFX) {
                            _clip.open(Ais);
                            _clip.setFramePosition(0);
                            _clip.start();
                        }

                        Main.ClearScreen();
                        Main.HEnemy -= Main.DIoann;
                        System.out.println("Your take damgae: "+Main.DIoann);
                        System.out.println("\n1: Next");

                        final byte FSelect = new Scanner(System.in).nextByte();

                        switch (FSelect){
                            case 1:
                                Main.ClearScreen();
                                Main.HIoann -= Main.DEnemy;
                                System.out.println("Health Ioann: "+Main.HIoann);
                                System.out.println("\nHealth -"+Main.DEnemy);
                                System.out.println("1: Next");
                                final byte FSelect2 = new Scanner(System.in).nextByte();

                                switch (FSelect2){
                                    case 1:
                                        Main.ClearScreen();
                                        EFight();
                                        break;
                                }
                                break;


                        }
                    } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
                        EFight();
                        exc.printStackTrace();
                        break;
                    }


                   case 2:
                       Main.ClearScreen();
                       Statistic stat = new Statistic();
                       stat.SLogic(false, true, false, false);
                       break;

                   case 3:
                       Main.ClearScreen();
                       inventory.inventory(true, false, false);
                       break;
                    }
            }
        }
    }
