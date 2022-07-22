package com.title;

import com.anim.MenuAnimClass;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainMenu {

    public boolean isMenu = false;


    File soundFile = new File("Audio/OST/This menu MAN!.wav");

    Clip clip;

    AudioInputStream ais;

    
    
    
    
    
    AudioInputStream Ais;
    
    File Sfx = new File("Audio/SFX/select.wav");

    
    
    
    

    public void StartAnim() throws InterruptedException{
        for (int i = 0; i < 18; i += 1) {
            Thread.sleep(270);
            MenuAnimClass.MAnim();
            if (i >= 17) {
                MainMenu mm = new MainMenu();
                Main main = new Main();
                main.ClearScreen();
                isMenu = true;
                mm.menu();
            }
        }
    }

    public void menu() throws InterruptedException{
        while (!isMenu) {
            try {

                MainMenu mm = new MainMenu();
                Main main = new Main();

                OptionClass os = new OptionClass();

                ais = AudioSystem.getAudioInputStream(soundFile);

                clip = AudioSystem.getClip();

                if(os.isMusic){
                    clip.open(ais);
                    clip.setFramePosition(0);
                    clip.start();
                }

                System.out.println("\tAdriana.System 2: \n\t\tAngelic Demonic Singing");

                Thread.sleep(450);

                System.out.println("\n\n1: Play\n");
                System.out.println("\t2: Options\n");
                System.out.println("\t\t3: Exit\n");
                
                
                System.out.println("\n    wQoD  ");
                System.out.println("    UIdS  ");
                System.out.println(" PolZZxNvcA");
                System.out.println(" MNlkjasPUe");
                System.out.println("    EWUQ   ");
                System.out.println("    GhSA   ");
                System.out.println("    DiOP   ");
                System.out.println("    iSdr   \n");
                
                
                System.out.println("\n\n  Powered By TitleChanQWERTY  'fuck me!'\n");
                

                final byte SMenu = new Scanner(System.in).nextByte();

                switch (SMenu) {
                    case 1:
                        try{
                            
                            Ais = AudioSystem.getAudioInputStream(Sfx);

                            Clip Clip = AudioSystem.getClip();

                            if(os.isSFX == true){
                                Clip.open(Ais);
                                Clip.setFramePosition(0);
                                Clip.start();
                            }
                            clip.stop();
                            LoadingSystem ls = new LoadingSystem();
                            Thread.sleep(150);
                            clip.stop();
                            ls.loading();
                        }
                        catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
                            exc.printStackTrace();
                        } catch (InterruptedException exc) {}
                        break;
                    case 2:
                        try{

                            File Sfx = new File("Audio/SFX/select3.wav");

                            AudioInputStream Ais = AudioSystem.getAudioInputStream(Sfx);

                            Clip Clip = AudioSystem.getClip();

                            if(os.isSFX == true){
                                Clip.open(Ais);
                                Clip.setFramePosition(0);
                                Clip.start();
                            }
                            os.isOption = true;
                            isMenu = false;
                            os.GOption();
                        }
                        catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
                            exc.printStackTrace();
                        } catch (InterruptedException exc) {}
                        break;
                    case 3:
                        isMenu = false;
                        clip.stop();
                        break;
                }
            }
            catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc){
                exc.printStackTrace();
            } catch (InterruptedException exc) {}
        }
    }
}