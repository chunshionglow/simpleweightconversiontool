package WCT;

import java.util.Scanner;

public class mainClass {
	//menu selection class declaration
	static menuSelection ms = new menuSelection();
	
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		
		int menuSelection;
		ms.mainMenu();
	}
}


