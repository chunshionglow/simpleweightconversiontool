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
					break;
				
				case "6":
					break;
				
				case "7":
					utilities.exitMessage();
					System.exit(0);
					break;
				
				default:
					utilities.invalidInput();
					canContinue = false;
					break;
			}
		}while(!canContinue);
	}
}
