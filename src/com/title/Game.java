package com.title;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Game {


	private File sound = new File("Audio/SFX/select.wav");

    private AudioInputStream Ais;

    private Clip _clip;

    
    
    
    static File sound2 = new File("Audio/SFX/select2.wav");
    
    static File sound3 = new File("Audio/SFX/select3.wav");
    
    
    static Clip clip;
    
    

    public static boolean LActive = false;

    public static boolean StartAudio = true;
    public static byte AudioLevel;
    
   
    

    public static void LGameplay(String messages) throws InterruptedException, LineUnavailableException, UnsupportedAudioFileException, IOException{
    	
        OptionClass os = new OptionClass();

        
        
        if(StartAudio){
            if(AudioLevel == 0){
                File soundFile = new File("Audio/OST/You Don't Hide.wav");

                AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

                clip = AudioSystem.getClip(); 

                if (os.isMusic&&StartAudio) {
                    clip.open(ais);
                    clip.setFramePosition(0);
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                    StartAudio = false;
                }
            }

            if(AudioLevel == 1){
                File soundFile = new File("Audio/OST/Perfect Demon.wav");

                AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

                clip = AudioSystem.getClip();
                

                if (os.isMusic&&StartAudio) {
                    clip.open(ais);
                    clip.setFramePosition(0);
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                    clip.start();
                    StartAudio = false;
                }
            }

            if(AudioLevel == 2){
                File soundFile = new File("Audio/OST/I don't remember you.wav");

                AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

                clip = AudioSystem.getClip();

                if (os.isMusic) {
                    clip.open(ais);
                    clip.setFramePosition(0);
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                    StartAudio = false;
                }
            }
            
            if(AudioLevel == 3) {
                File soundFile = new File("Audio/OST/I'm already there... probably.wav");

                AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

                clip = AudioSystem.getClip();

                if (os.isMusic) {
                    clip.open(ais);
                    clip.setFramePosition(0);
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                    StartAudio = false;
                }
            }

            if(AudioLevel == 4) {
                File soundFile = new File("Audio/OST/I would like... no I didn't.wav");

                AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

                clip = AudioSystem.getClip();

                if (os.isMusic) {
                    clip.open(ais);
                    clip.setFramePosition(0);
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                    StartAudio = false;
                }
            } 
            
            
            if(AudioLevel == 5) {
                File soundFile = new File("Audio/OST/Why would you want to kill them?.wav");

                AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

                clip = AudioSystem.getClip();

                if (os.isMusic) {
                    clip.open(ais);
                    clip.setFramePosition(0);
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                    StartAudio = false;
                }
            } 
            
        }
    	
    	
        while (LActive) {
            try {
           

                if(Main.percent >= 1){
                    Main.HEnemy = 13;
                    Main.DEnemy = 4;
                }

                if(Main.percent >= 9){
                    Main.DEnemy = 7;
                    Main.HEnemy = 21;
                }

                if(Main.percent >= 14){
                    Main.DEnemy = 13;
                    Main.HEnemy = 39;
                }
                
                if(Main.percent >= 23) {
                	Main.DEnemy = 17;
                	Main.HEnemy = 45;
                }
                
                


                if(Main.km == 110){
                    Main.ClearScreen();
                    Dialog dialog = new Dialog();
                    LActive = false;
                    dialog.dialogAnna = true;;
                    dialog.dialog_anna();    
                    break;
                }

                if(Main.km == 191){
                    Main.ClearScreen();
                    Dialog dialog = new Dialog();
                    LActive = false;
                    dialog.dialog_Jan();
                    break;
                }

                if(Main.km == 252){
                    Main.ClearScreen();
                    Dialog dialog = new Dialog();
                    LActive = false;
                    dialog.dialog_Avdotya();
                    break;
                }

                if(Main.km == 383){
                    Main.ClearScreen();
                    Dialog dialog = new Dialog();
                    LActive = false;
                    dialog.danaDialog();
                    break;
                }
                if(Main.km == 454){
                    Main.ClearScreen();
                    Dialog dialog = new Dialog();
                    LActive = false;
                    dialog.AnfisaDialog();
                    break;
                }
                
                
                if(Main.km == 515) {
                	Main.ClearScreen();
                	Dialog dialog = new Dialog();
                	LActive = false;
                	dialog.VikaDialog();
                	break;
                }
                
                
                

                Main.ClearScreen();

                System.out.println(messages);

                System.out.println("\n------------------------------------\n");

                System.out.println(Main.NLevel);

                System.out.println("\n---------------------------------------------------------------\n");

                
                Thread.sleep(3);
                
                
                System.out.print("\n1: Walk");
                System.out.print("\t\t2: Upgrade|Reset");
                System.out.print("\t3: Statistic");

                if(Main.km>=85){
                    System.out.print("\t4: Task");
                }

                if(Main.km >= 95){
                    System.out.print("\t   5: Shop");
                }

                System.out.println("\n---------------------------------------------------------------\n");
                
                switch (AudioLevel) {
				case 0:
					System.out.println("\nAudio: Audio/OST/You Don't Hide.wav\n");
					break;
					
				case 1:
					System.out.println("\nAudio: Audio/OST/Perfect Demon.wav\n");
					break;
					
				case 2:
					System.out.println("\nAudio: Audio/OST/I don't remember you.wav\n");
					break;
					
				case 3:
					System.out.println("\nAudio: Audio/OST/I'm already there... probably.wav\n");
					break;
					
				case 4:
					System.out.println("\nAudio: Audio/OST/I would like... no I didn't.wav\n");
					break;
					
				case 5:
					System.out.println("\nAudio: Audio/OST/Why would you want to kill them?.wav\n");
					break;	
				}
                

                final byte LSelect = new Scanner(System.in).nextByte();

                switch (LSelect) {

                    case 1:
                            if (Main.luck >= 85) {
                            	StartAudio = false;
                                Main.luck -= 5;
                                Main.km += 5;
                                Main.ClearScreen();
                                Thread.sleep(5);
                                LGameplay("Your walk 5km");
                            } if (Main.luck <= 84) {
                            	StartAudio = false;
                                Main.ClearScreen();
                                EGamePlay egp = new EGamePlay();
                                egp.EActive = true;
                                LActive = false;
                                egp.EFight();
                            }

                        break;

                    case 2:
                        try{
                            AudioInputStream Ais = AudioSystem.getAudioInputStream(sound2);

                            Clip _clip = AudioSystem.getClip();

                            if (os.isSFX) {
                                _clip.open(Ais);
                                _clip.setFramePosition(0);
                                _clip.start();
                            }
                            Main.ClearScreen();
                            upgrade up = new upgrade();
                            LActive = false;
                            up.Upgrade();
                        }catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
                            exc.printStackTrace();
                        }
                        break;

                    case 3:
                        try{        

                            AudioInputStream Ais = AudioSystem.getAudioInputStream(sound3);

                            Clip _clip = AudioSystem.getClip();

                            if (os.isSFX) {
                                _clip.open(Ais);
                                _clip.setFramePosition(0);
                                _clip.start();
                            }
                            Main.ClearScreen();
                            Statistic stat = new Statistic();
                            LActive = false;
                            stat.SLogic(true, false, false, false);

                        }catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
                            exc.printStackTrace();
                        }
                        break;
                    case 4:
                        try {
                            File sound = new File("Audio/SFX/select.wav");

                            AudioInputStream Ais = AudioSystem.getAudioInputStream(sound);

                            Clip _clip = AudioSystem.getClip();

                            if (os.isSFX) {
                                _clip.open(Ais);
                                _clip.setFramePosition(0);
                                _clip.start();
                            }
                            if(Main.km >= 85){
                                Main.ClearScreen();
                                TaskSystem taskSystem = new TaskSystem();
                                LActive = false;
                                taskSystem.taskSelect();
                                break;
                            }

                            else {
                                LGameplay(messages);
                            }
                        }catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
                            exc.printStackTrace();
                        }
                        break;

                    case 5:
                        if(Main.km >= 95){
                            Main.ClearScreen();
                            LActive = false;
                            ShopSystem shopSystem = new ShopSystem();
                            shopSystem.shop();
                        }
                        else {
                            Main.ClearScreen();
                            LGameplay(messages);
                        }
                        break;

                }
            } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
                exc.printStackTrace();
                break;
            }
        }
    }
}