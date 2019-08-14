package WCT;

import java.util.Scanner;

public class functions {
	static Scanner userInput = new Scanner(System.in);
	
	//Pounds to KG conversion 
	public static void pounds2KG() {
		double pounds, kg;
		utilities.print("Enter in Pounds: ");
		pounds = userInput.nextDouble();
		kg = pounds / 2.205;
		utilities.print("Pounds : " + pounds + "\nKG :" + kg);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenuWithSelection();
	}
	
	//KG to Pounds conversion
	public static void KG2pounds() {
		double kg, pounds;
		utilities.print("Enter in Kilograms: ");
		kg = userInput.nextDouble();
		pounds = kg * 2.205;
		utilities.print("KG: " + kg + "\nPounds: "+ pounds);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenuWithSelection();
	}
	
	//KG to grams conversion
	public static void KG2grams() {
		double kg, grams;
		utilities.print("Enter in Kilograms: ");
		kg = userInput.nextDouble();
		grams = kg * 1000;
		utilities.print("Grams: " + grams + "\nKG: " + kg);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenuWithSelection();
	}
	
	//Grams to KG conversion
	public static void grams2KG() {
		double grams , kg;
		utilities.print("Enter in grams: ");
		grams = userInput.nextDouble();
		kg = grams / 1000;
		utilities.print("KG: " + kg + "\nGrams: " + grams);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenuWithSelection();
	}
	
	//Milligram to Grams conversion
	public static void MG2grams() {
		double milligram, grams;
		utilities.print("Enter in Miligram");
		milligram = userInput.nextDouble();
		grams = milligram / 1000;
		utilities.print("Grams: " + grams + "\nMiligrams: " + milligram);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenuWithSelection();
	}
	
	//Grams to milligrams conversion
	public static void grams2MG() {
		double grams, milligram;
		utilities.print("Enter in Grams: ");
		grams = userInput.nextDouble();
		milligram = grams * 1000;
		utilities.print("Milligrams: " + milligram + "\nGrams: " + grams);
		utilities.print("Press Enter to Continue");
		userInput.nextLine();
		userInput.nextLine();
		menuSelection.mainMenuWithSelection();
	}
}
