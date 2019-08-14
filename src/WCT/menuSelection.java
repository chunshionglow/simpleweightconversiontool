package WCT;

import java.util.Scanner;

public class menuSelection{	
	static Scanner userInput = new Scanner(System.in);
	
	public static void header() {
		utilities.print("----------WEIGHT CONVERSATION TOOL----------\n");
	}
	public static void mainMenu() {
		boolean canContinue = true;
		do{
			header();
			utilities.print("1. Pounds to KG\n2. KG to Pounds\n"
				+ "3. KG to Grams\n4. Grams to KG\n"
				+ "5. Miligrams to Grams\n"
				+ "6. Grams to Miligrams\n"
				+ "7. Exit");
			String Choice = userInput.nextLine();
		
			switch(Choice) {
				case "1":
					functions.pounds2KG();
					break;
			
				case "2":
					functions.KG2pounds();
					break;
			
				case "3":
					break;
					
				case "4":
					break;
				
				case "5":
					break;
				
				case "6":
					break;
				
				case "7":
					utilities.print("Thank You For Using!");
					System.exit(0);
					break;
				
				default:
					utilities.print("Invalid Input. Please Try Again");
					canContinue = false;
					break;
			}
		}while(!canContinue);
	}
}
