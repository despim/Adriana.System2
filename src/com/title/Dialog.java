package com.title;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Dialog {

    public static boolean dialogAnna = false;

    
    public static Clip clip;
    
    

    public static void dialog_anna(){
        while (dialogAnna) {
            System.out.println("Anna: Hello!");
            System.out.println("\n1: Next");

            final byte select = new Scanner(System.in).nextByte();

            switch (select){
                case 1:
                    Main.ClearScreen();
                    System.out.println("Ioann: Hello");
                    System.out.println("\n1: Next");
                    final byte select1 = new Scanner(System.in).nextByte();
                    switch (select1){
                        case 1:
                            Main.ClearScreen();
                            Game.StartAudio = false;
                        	Game.clip.stop();
                            System.out.println("Anna: You know, I haven't had an orgasm for a long time, can you help me");
                            System.out.println("\n1: Next");
                            final byte select2 = new Scanner(System.in).nextByte();
                            switch (select2){
                                case 1:
                                    Main.ClearScreen();
                                    System.out.println("Ioann: Fuck NO!");
                                    System.out.println("\n1: Next");
                                    final byte select3 = new Scanner(System.in).nextByte();
                                    switch (select3){

                                        case 1:
                                        	Main.ClearScreen();
                                            System.out.println("Anna: Please!!!");
                                            System.out.println("\n1: Next");
                                            final byte select4 = new Scanner(System.in).nextByte();
                                            switch (select4){
                                                case 1:
                                                	try {

														 File soundFile = new File("Audio/OST/Rape you or what.wav");	 

													     AudioInputStream ais;

													     OptionClass os = new OptionClass();

											                ais = AudioSystem.getAudioInputStream(soundFile);

											                clip = AudioSystem.getClip();

											                if(os.isMusic){
											                    clip.open(ais);
											                    clip.setFramePosition(0);
											                    clip.loop(Clip.LOOP_CONTINUOUSLY);
											                    clip.start();
											                }
                                                		
                                                        Main.ClearScreen();
                                                        BossSystem bossSystem = new BossSystem();
                                                        Main.HBoss = 80;
                                                        Main.DBoss = 6;                                  
                                                        bossSystem.name = "Anna";
                                                        Main.NLevel = "Sersonatus: Lane of illegal immigrants";
                                                        bossSystem.isActiveBoss = true;
                                                        bossSystem.bossFight();
                                                        break;	
                                                	} catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
    										                exc.printStackTrace();
    										            }
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
    }







    public void dialog_Jan(){
        Main.ClearScreen();
        System.out.println("Jan: Stop!");
        System.out.println("\n 1: Next");
        final byte select = new Scanner(System.in).nextByte();

        switch (select){

            case 1:
                Main.ClearScreen();
                Game.StartAudio = false;
            	Game.clip.stop();
                System.out.println("Ioann: ...");
                System.out.println("\n1: Next");
                final byte select1 = new Scanner(System.in).nextByte();

                switch (select1){

                    case 1:
                        Main.ClearScreen();
                        System.out.println("Jan: I said stop");
                        System.out.println("\n1: Next");
                        final byte select2 = new Scanner(System.in).nextByte();

                        switch (select2){

                            case 1:
                            	try {

                            		 File soundFile = new File("Audio/OST/Without a reason.wav");	 

								     AudioInputStream ais;

								     OptionClass os = new OptionClass();

						                ais = AudioSystem.getAudioInputStream(soundFile);

						                clip = AudioSystem.getClip();

						                if(os.isMusic){
						                    clip.open(ais);
						                    clip.setFramePosition(0);
						                    clip.loop(Clip.LOOP_CONTINUOUSLY);
						                    clip.start();
						                }
                            		
                            		
                                	Main.ClearScreen();
                                    BossSystem bossSystem = new BossSystem();
                                    bossSystem.isActiveBoss = true;
                                    Main.HBoss = 105;
                                    Main.DBoss = 9;
                                    bossSystem.name = "Jan";
                                    Game.StartAudio = false;
                                    Game.clip.stop();
                                    Main.NLevel = "Sersonatus: Demonic District";
                                    bossSystem.bossFight();
                                    break;	
                            	}catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
					                exc.printStackTrace();
					            }
                        }
                        break;
                }
                break;
        }
    }

    public void dialog_Avdotya(){

        System.out.println("Avdotya: Hello Long time no see pie");
        System.out.println("\n1: Next");
        final byte select = new Scanner(System.in).nextByte();
        switch (select){

            case 1:
                Main.ClearScreen();
                System.out.println("Ioann: Long time no see slut");
                System.out.println("\n1: Next");
                final byte select2 = new Scanner(System.in).nextByte();
                switch (select2){

                    case 1:
                        Main.ClearScreen();
                        System.out.println("Avdotya: Listen, since this is a place where demons live, let's do something not godly :)...");
                        System.out.println("\n1: Next\n");
                        final  byte select3 = new Scanner(System.in).nextByte();
                        switch (select3){

                            case 1:
                                Main.ClearScreen();
                                System.out.println("Ioann: Of course, I don’t mind, but I don’t have any cases, and that’s the loss of virginity with the demon, well, somehow I don’t want to");
                                System.out.println("\n1: Next\n");
                                final byte select4 = new Scanner(System.in).nextByte();
                                switch (select4){

                                    case 1:
                                        Main.ClearScreen();
                                        System.out.println("Avdotya: then I will kill you and rape your corpse");
                                        System.out.println("\n1: Next\n");
                                        final byte select5 = new Scanner(System.in).nextByte();
                                        switch (select5){

                                            case 1:
                                            	
                                            	try {

                                            		 File soundFile = new File("Audio/OST/Necrophile Girl who wants you.wav");	 

                								     AudioInputStream ais;

                								     OptionClass os = new OptionClass();

                						                ais = AudioSystem.getAudioInputStream(soundFile);

                						                clip = AudioSystem.getClip();

                						                if(os.isMusic){
                						                    clip.open(ais);
                						                    clip.setFramePosition(0);
                						                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                						                    clip.start();
                						                }
                                            		
                                                    Main.ClearScreen();
                                                    BossSystem bossSystem = new BossSystem();
                                                    bossSystem.isActiveBoss = true;
                                                    Main.HBoss = 145;
                                                    Main.DBoss = 19;
                                                    bossSystem.name = "Avdotya";
                                                    Game.StartAudio = false;
                                                    Game.clip.stop();
                                                    Main.NLevel = "Sersonatus: Hell Bottom";
                                                    bossSystem.bossFight();
                                                    break;

                                            	}catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
                					                exc.printStackTrace();
                					            }
                                            	
                                            	
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public void danaDialog(){
        Main.ClearScreen();
        System.out.println("dana: Hello!");
        System.out.println("\n1: Next");
        final byte select = new Scanner(System.in).nextByte();

        switch (select){
            case 1:
                Main.ClearScreen();
                System.out.println("Ioann: Bye");
                System.out.println("\n1: Next");
                final byte select1 = new Scanner(System.in).nextByte();

                switch (select1){
                    case 1:
                    	try {
                    		 File soundFile = new File("Audio/OST/Strangers Kinda Like.wav");	 

						     AudioInputStream ais;

						     OptionClass os = new OptionClass();

				                ais = AudioSystem.getAudioInputStream(soundFile);

				                clip = AudioSystem.getClip();

				                if(os.isMusic){
				                    clip.open(ais);
				                    clip.setFramePosition(0);
				                    clip.loop(Clip.LOOP_CONTINUOUSLY);
				                    clip.start();
				                }
                            Main.ClearScreen();
                            BossSystem bossSystem = new BossSystem();
                            bossSystem.isActiveBoss = true;
                            Main.HBoss = 186;
                            Main.DBoss = 31;
                            bossSystem.name = "Dana";
                            Game.StartAudio = false;
                            Game.clip.stop();
                            Main.NLevel = "Devil's Library";
                            bossSystem.bossFight();
                            break;	
                    	}catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
			                exc.printStackTrace();
			            }
                }
                break;

        }

    }

    public void AnfisaDialog(){
        Main.ClearScreen();
        System.out.println("Anfisa: so what do you need?");
        System.out.println("\n1: Next");
        final byte select = new Scanner(System.in).nextByte();
        switch (select){
            case 1:
                Main.ClearScreen();
                System.out.println("Ioann: Angelic duty to beat");
                System.out.println("\n1: Next");
                final byte select1 = new Scanner(System.in).nextByte();
                switch (select1){
                    case 1:
                        Main.ClearScreen();
                        System.out.println("Anfisa: Maybe I'd better give myself to you");
                        System.out.println("\n1: Next");
                        final byte select2 = new Scanner(System.in).nextByte();
                        switch (select2){
                            case 1:
                                Main.ClearScreen();
                                System.out.println("Ioann: let me fuck you");
                                System.out.println("\n1: Next");
                                final byte select3 = new Scanner(System.in).nextByte();
                                switch (select3){
                                    case 1:
                                    	try {
                                    		
                                    		File soundFile = new File("Audio/OST/The flower you need for fucking.wav");	 

               						     	AudioInputStream ais;

               						     	OptionClass os = new OptionClass();

               				                ais = AudioSystem.getAudioInputStream(soundFile);

               				                clip = AudioSystem.getClip();

               				                if(os.isMusic){
               				                    clip.open(ais);
               				                    clip.setFramePosition(0);
               				                    clip.loop(Clip.LOOP_CONTINUOUSLY);
               				                    clip.start();
               				                }
                                    		
                                    		 Main.ClearScreen();
                                             BossSystem bossSystem = new BossSystem();
                                             bossSystem.isActiveBoss = true;
                                             Main.HBoss = 243;
                                             Main.DBoss = 41;
                                             bossSystem.name = "Anfisa";
                                             Game.StartAudio = false;
                                             Game.clip.stop();
                                             Main.NLevel = "Devil's Library";
                                             bossSystem.bossFight();
                                             break;
                                    	}catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
                			                exc.printStackTrace();
                			            }
                                       
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }







	public void VikaDialog() {
		System.out.println("Vika:..... Well..... Hello!");
		
		System.out.println("\n1: Next");
		final byte select = new Scanner(System.in).nextByte();
		switch (select) {
		case 1: 
			Main.ClearScreen();
			System.out.println("Ioann: Fuck you very sad!");
			System.out.println("\n1: Next");
			final byte select1 = new Scanner(System.in).nextByte();
			switch (select1) {
			case 1: 
				Main.ClearScreen();
				System.out.println("Vika: NO! NO! NO!");
				System.out.println("\n1: Next");
				final byte select2 = new Scanner(System.in).nextByte();
				switch (select2) {
				case 1:
					try {
						Thread.sleep(60);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Main.ClearScreen();
					Game.StartAudio = false;
                    Game.clip.stop();
					System.out.println("Vika: no");
					System.out.println("\n1: Next");
					final byte select3 = new Scanner(System.in).nextByte();
					switch (select3) {
					case 1:
					
						Main.ClearScreen();
						System.out.println("...................");
						final byte select4 = new Scanner(System.in).nextByte();
						switch (select4) {
						case 1:
						
							Main.ClearScreen();
							System.out.println("VIka: yes");
							System.out.println("\n1: Next");
							final byte select5 = new Scanner(System.in).nextByte();
							switch (select5) {
							case 1:
							
								Main.ClearScreen();
								System.out.println("Ioann: What?");
								System.out.println("\n1: Next");
								final byte select6 = new Scanner(System.in).nextByte();
								switch (select6) {
								case 1:
								
									Main.ClearScreen();
									System.out.println("Vika: YES! YES! YES! YES! YES! YES!");
									System.out.println("\n1: Next");
									final byte select7 = new Scanner(System.in).nextByte();
									switch (select7) {
									case 1:
									
										Main.ClearScreen();
										System.out.println("Ioann: Bitch why?!");
										System.out.println("\n1: Next");
										final byte select8 = new Scanner(System.in).nextByte();
										switch (select8) {
										case 1:
											
											Main.ClearScreen();
											System.out.println("Vika: Because I want to kill these fucking people, they already honestly fucked me, I just want to live in peace and not be humiliated");
											System.out.println("\n1: Next");
											final byte select9 = new Scanner(System.in).nextByte();
											switch (select9) {
											case 1:
												
												Main.ClearScreen();
												System.out.println("Ioann: Uh-huh, I see, well, if you kill me, you can do whatever you want ahem");
												System.out.println("\n1: Next");
												final byte select10 = new Scanner(System.in).nextByte();
												switch (select10) {
												case 1:		
													
													try {
														Main.ClearScreen();
														
														 File soundFile = new File("Audio/OST/Resentment is not the enemy.wav");

														 Clip clip;

													     AudioInputStream ais;

													     OptionClass os = new OptionClass();

											                ais = AudioSystem.getAudioInputStream(soundFile);

											                clip = AudioSystem.getClip();

											                if(os.isMusic){
											                    clip.open(ais);
											                    clip.setFramePosition(0);
											                    clip.start();
											                }
														
														
				                                        BossSystem bossSystem = new BossSystem();
				                                        bossSystem.isActiveBoss = true;
				                                        Main.HBoss = 285;
				                                        Main.DBoss = 46;
				                                        bossSystem.name = "Vik@";				                                    
				                                        bossSystem.bossFight();
													break;
													}catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
										                exc.printStackTrace();
										            }
													
														
												}
												break;
											}
											
											
											break;

										}
										break;

									}
									break;

								}
								break;

							}
							break;

						}
						break;

					}
					break;
				}
				break;
			}
			
			break;
		}	
	}
}
