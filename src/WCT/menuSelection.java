package WCT;

import java.util.Scanner;

public class menuSelection{	
	static Scanner userInput = new Scanner(System.in);
	
	public static void mainMenuWithSelection() {
		boolean canContinue = true;
		do{
			utilities.header();
			utilities.mainMenu();
			String Choice = userInput.nextLine();
		
			switch(Choice) {
				case "1":
					functions.pounds2KG();
					break;
			
				case "2":
					functions.KG2pounds();
					break;
			
				case "3":
					functions.KG2grams();
					break;
					
				case "4":
					functions.grams2KG();
					break;
				
				case "5":
					functions.MG2grams();
					break;
				
				case "6":
					functions.grams2MG();
					break;
				
				case "7":
					utilities.exitMessage();
					System.exit(0);
					break;
				
				default:
					utilities.invalidInput();
					System.out.println("Please enter values 1 - 7");
					canContinue = false;
					break;
			}
		}while(!canContinue);
	}
}
