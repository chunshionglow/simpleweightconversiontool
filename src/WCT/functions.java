package WCT;

import java.util.Scanner;

public class functions {
	static Scanner userInput = new Scanner(System.in);
	
	//Pounds to KG conversion 
	public static void pounds2KG() {
		double pounds = 0, kg = 0;
		//check if input is numeric
		try {
			utilities.print("Enter in Pounds: ");
			pounds = Double.parseDouble(userInput.next());
		} catch(NumberFormatException ignore) {
			utilities.invalidInput();
			pounds2KG();
		}
		kg = pounds / 2.205;
		utilities.print("Pounds : " + pounds + "\nKG :" + kg);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenuWithSelection();
	}
	
	//KG to Pounds conversion
	public static void KG2pounds() {
		double kg = 0, pounds = 0;
		//check if input is numeric
		try {
			utilities.print("Enter in Kilograms: ");
			kg = Double.parseDouble(userInput.next());
		}catch(NumberFormatException ignore) {
			utilities.invalidInput();
			KG2pounds();
		}
		pounds = kg * 2.205;
		utilities.print("KG: " + kg + "\nPounds: "+ pounds);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenuWithSelection();
	}
	
	//KG to grams conversion
	public static void KG2grams() {
		double kg = 0, grams = 0;
		//check if input is numeric
		try {
			utilities.print("Enter in Kilograms: ");
			kg = Double.parseDouble(userInput.next());
		}catch(NumberFormatException ignore) {
			utilities.invalidInput();
			KG2grams();
		}
		grams = kg * 1000;
		utilities.print("Grams: " + grams + "\nKG: " + kg);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenuWithSelection();
	}
	
	//Grams to KG conversion
	public static void grams2KG() {
		double grams = 0, kg = 0;
		try {
			utilities.print("Enter in grams: ");
			grams = Double.parseDouble(userInput.next());
		}catch(NumberFormatException ignore) {
			utilities.invalidInput();
			grams2KG();
		}
		kg = grams / 1000;
		utilities.print("KG: " + kg + "\nGrams: " + grams);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenuWithSelection();
	}
	
	//Milligram to Grams conversion
	public static void MG2grams() {
		double milligram = 0, grams = 0;
		try {
			utilities.print("Enter in Miligram");
			milligram = Double.parseDouble(userInput.next());
		}catch(NumberFormatException ignore) {
			utilities.invalidInput();
			MG2grams();
		}
		grams = milligram / 1000;
		utilities.print("Grams: " + grams + "\nMiligrams: " + milligram);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenuWithSelection();
	}
	
	//Grams to milligrams conversion
	public static void grams2MG() {
		double grams = 0, milligram = 0;
		try {
			utilities.print("Enter in Grams: ");
			grams = Double.parseDouble(userInput.next());
		}catch(NumberFormatException ignore) {
			utilities.invalidInput();
			grams2MG();
		}
		milligram = grams * 1000;
		utilities.print("Milligrams: " + milligram + "\nGrams: " + grams);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenuWithSelection();
	}
}
