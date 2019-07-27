package WCT;

import java.util.Scanner;

public class menuSelection{
	//Functions class declaration
	static functions f = new functions();
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void print(Object msg) {
		System.out.println(msg);
	}
	public static void header() {
		print("----------WEIGHT CONVERSATION TOOL----------\n");
	}
	public static void mainMenu() {
		boolean canContinue = true;
		do{
			header();
			print("1. Pounds to KG\n2. KG to Pounds\n"
		
				+ "3. KG to Grams\n4. Grams to KG\n"
				+ "5. Miligrams to Grams\n"
				+ "6. Grams to Miligrams\n"
				+ "7. Exit");
			String Choice = userInput.nextLine();
		
			switch(Choice) {
				case "1":
					f.pounds2KG();
					break;
			
				case "2":
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
					print("Thank You For Using!");
					System.exit(0);
					break;
				
				default:
					print("Invalid Input. Please Try Again");
					canContinue = false;
					break;
			}
		}while(!canContinue);
	}
}
