package menu;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import calcFunctions.*;

public class Menu {

	public void menu() {

		CalcFunctions calcFun = new CalcFunctions();

		Scanner scan = new Scanner(System.in);
		boolean quit = false;
		float numOne, numTwo;
		int timer = 5;

		do {
			System.out.println("=".repeat(20));
			System.out.println("Select a calculation: \n" + "1: Addition, \n" + "2 Subtraction, \n"
					+ "3 Multiplication, \n" + "4 Division \n" + "5 Quit");
			System.out.println("=".repeat(20));

			int user = scan.nextInt();

			switch (user) {
			case 1:
				System.out.println("Enter number one: ");
				numOne = scan.nextFloat();
				System.out.println("Enter number two: ");
				numTwo = scan.nextFloat();

				calcFun.Addition(numOne, numTwo);
				System.out.println("The result is: " + calcFun.result + "\n");
				break;
				
			case 2:
				System.out.println("Enter number one: ");
				numOne = scan.nextFloat();
				System.out.println("Enter number two: ");
				numTwo = scan.nextFloat();

				calcFun.Subtraction(numOne, numTwo);
				System.out.println("The result is: " + calcFun.result + "\n");
				break;
				
			case 3:
				System.out.println("Enter number one: ");
				numOne = scan.nextFloat();
				System.out.println("Enter number two: ");
				numTwo = scan.nextFloat();

				calcFun.Multiplication(numOne, numTwo);
				System.out.println("The result is: " + calcFun.result + "\n");
				break;
				
			case 4:
				System.out.println("Enter number one: ");
				numOne = scan.nextFloat();
				System.out.println("Enter number two: ");
				numTwo = scan.nextFloat();

				calcFun.Division(numOne, numTwo);
				System.out.println("The result is: " + calcFun.result + "\n");
				break;
				
			case 5:
				System.out.println("Bye for now!");
				quit = true;
				break;
				
			default:
				System.out.println("Please try again");
			}

			// creates a delay based on the value saved in timer
			try {
				TimeUnit.SECONDS.sleep(timer);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} while (!quit);
	}
}