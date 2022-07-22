package com.title;

import java.util.Scanner;

public class Final {

	
	public static void finaL() {
		Main.ClearScreen();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Ioann: You see, we do everything for you, you understand, we need you, and not because you are our goddess, but because you are like MOM to us");
		
		System.out.println("\n1: Next");
		final byte select = new Scanner(System.in).nextByte();
		switch (select) {
		case 1:
			Main.ClearScreen();
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("Adriana: Thank you very much, you are honestly beautiful, what would I do without you, all the past Adrians were only a sign and no one liked me, but anyway, at least someone needs me");
			System.out.println("\n 1: Next");
			
			final byte select1 = new Scanner(System.in).nextByte();
			
			switch (select1) {
			case 1:
				
				Main.ClearScreen();
				
				try {
					Thread.sleep(350);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("TitleChanQWERTY: Thank you for playing, you are wonderful if you liked the game, then I will be very happy and yes, here is my gift to you");
				System.out.println("\n 1: Next");
				
				final byte select2 = new Scanner(System.in).nextByte();
				
				switch (select2) {
				case 1:
					Main.ClearScreen();
				
					System.out.println("    QWUTEU   QWERTY  ");
					System.out.println("  RQZ     ASD    JKL ");
					System.out.println(" XC                ZC");
					System.out.println("UM                  MN");
					System.out.println("BP                  LK");
					System.out.println(" OZ                UI ");
					System.out.println("  BJ              OP  ");
					System.out.println("    GD          TY    ");
					System.out.println("      SP      NL      ");
					System.out.println("        HG   VB       ");
					System.out.println("          ATI          ");
					
					
					
					System.out.println("\nTHANKS");
					
					System.out.println("\n1: Next");
					
					final byte select3 = new Scanner(System.in).nextByte();
					
					switch (select3) {
					case 1:
						
						Main.ClearScreen();
						MainMenu mainMenu = new MainMenu();
						try {
							mainMenu.menu();
						} catch (InterruptedException e) {		
							e.printStackTrace();
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
