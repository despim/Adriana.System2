package com.title;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class BossSystem {

   public boolean isActiveBoss = false;

   public String name;

    public void bossFight(){
        while (isActiveBoss){
            Game game = new Game();
            if(Main.HIoann <= 0){
                Main.ClearScreen();
                DieScreen ds = new DieScreen();
                Dialog.clip.stop();
                Game.AudioLevel = 0;
                Game.StartAudio = true;
                try {
                    isActiveBoss = false;
                    ds.DScreen();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            }


            if(Main.HBoss <= 0){
                Main.ClearScreen();
                System.out.println("You Kill!");
                System.out.println("1: Next");

                final byte WSelect = new Scanner(System.in).nextByte();

                switch (WSelect){
                    case 1:
					try {
						Thread.sleep(100);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
                    	Dialog.clip.stop();
                        Main.ClearScreen();
                        Main.luck = 110;
                        Main.percent++;
                        Main.point += 30;
                        isActiveBoss = false;
                                    
                        
                        Game.LActive = true;
                        if(Main.km == 110){
                            Main.DIoann = 9;
                            try {
                            	Main.km++;
                                try {
                                	Game.AudioLevel = 1;
                                	Game.StartAudio = true;
									Game.LGameplay("You Take M4");
								} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }

                        if(Main.km == 191){
                            Main.DIoann = 18;
                            try {
                            	Main.km++;
                                try {
                                	Game.AudioLevel = 2;
                                	Game.StartAudio = true;
									game.LGameplay("You Take FN FNC");
								} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }

                        if(Main.km == 252){
                            Main.DIoann = 26;
                            try {
                            	Main.km++;
                                try {
                                	Game.AudioLevel = 3;
                                	Game.StartAudio = true;
									game.LGameplay("You Take Mossberg 500");
								} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }                   
                        }
                        
                        
                       if(Main.km == 383) {
                        	Main.DIoann = 35;
                            try {
                            	Main.km++;
                                try {
                                	Game.AudioLevel = 4;
                                	Game.StartAudio = true;
									game.LGameplay("You Take AK-47... ok");
								} catch (LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (UnsupportedAudioFileException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                         
                        } 
                        
                        if(Main.km == 454) {
                        	Main.DIoann = 40;
                            try {
                            	Main.km++;
                                try {
                                	Game.AudioLevel = 5;
                                	Game.StartAudio = true;
									game.LGameplay("You Take Devil Sword! 'Yeah this very epic!'\n ");
								} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        
                        if (Main.km >= 515) {
                        	Main.km++;
                        	isActiveBoss = false;
                        	Dialog.clip.stop();
                        	Main.ClearScreen();
                        	try {
								Thread.sleep(120);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                        	
							Final.finaL();
						
						}

                        break;

                }
            }


            System.out.println(name+" Health: "+Main.HBoss);
            System.out.println("\nIoann Health: "+Main.HIoann);
            System.out.println("\n-------------------------\n");


            System.out.print("1: Fight");
            System.out.print("\t2: Statistic");
            System.out.print("\t3: Inventory\n");

            final byte select = new Scanner(System.in).nextByte();

            switch (select){

                case 1:
                    Main.ClearScreen();
                    Main.HBoss -= Main.DIoann;
                    System.out.println("Your take damgae: "+Main.DIoann);
                    System.out.println("\n1: Next");

                    final byte FSelect = new Scanner(System.in).nextByte();

                    switch (FSelect){
                        case 1:
                            Main.ClearScreen();
                            Main.HIoann -= Main.DBoss;
                            System.out.println("Health Ioann: "+Main.HIoann);
                            System.out.println("\nHealth -"+Main.DBoss);
                            System.out.println("1: Next");
                            final byte FSelect2 = new Scanner(System.in).nextByte();

                            switch (FSelect2){
                                case 1:
                                    Main.ClearScreen();
                                    bossFight();
                                    break;
                            }
                            break;
                    }

                case 2:
                    Main.ClearScreen();
                    Statistic stat = new Statistic();
                    try {
                        stat.SLogic(false, false, false, true);
                    }
                    catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 3:
                    Main.ClearScreen();
                    Inventory inventory = new Inventory();
                    inventory.inventory(false, true, false);
                    break;
            }

        }
    }
}
