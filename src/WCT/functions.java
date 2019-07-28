package WCT;

import java.util.Scanner;

public class functions {
	//menu selection class declaration
	static menuSelection ms = new menuSelection();
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void pounds2KG() {
		double pounds, kg;
		ms.print("Enter in Pounds: ");
		pounds = userInput.nextDouble();
		kg = pounds / 2.205;
		ms.print("Pounds : " + pounds + "\nKG :" + kg);
		ms.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		ms.mainMenu();
	}
	
	public static void KG2pounds() {
		
	}
}
