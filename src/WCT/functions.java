package WCT;

import java.util.Scanner;

public class functions {
	static Scanner userInput = new Scanner(System.in);
	
	public static void pounds2KG() {
		double pounds, kg;
		utilities.print("Enter in Pounds: ");
		pounds = userInput.nextDouble();
		kg = pounds / 2.205;
		utilities.print("Pounds : " + pounds + "\nKG :" + kg);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenu();
	}
	
	public static void KG2pounds() {
		double pounds, kg;
		utilities.print("Enter in Kilograms: ");
		kg = userInput.nextDouble();
		pounds = kg / 2.205;
		utilities.print("KG: " + kg + "\nPounds: "+ pounds);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenu();
	}
}
