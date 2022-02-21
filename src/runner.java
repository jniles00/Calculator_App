import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class runner {

	public static void main(String[] args) {

		Addition add = new Addition();
		Subtraction sub = new Subtraction();
		Multiplication multiply = new Multiplication();
		Division div = new Division();

		Scanner scan = new Scanner(System.in);
		//String userIn = "";
		int timer = 5;
		boolean quit = false;

		do {
			System.out.println("Select your math thing: \n"
					+ "(A)ddition, \n"
					+ "(S)ubtraction, \n"
					+ "(M)ultiplication, \n"
					+ "(D)ivision \n"
					+ "(Q)uit \n");

			String s = scan.next();

			if(s.equals("a"))
			{
				System.out.println("Enter number one: ");
				float numOne = scan.nextFloat();
				System.out.println("Enter number two: ");
				float numTwo = scan.nextFloat();

				add.Addition(numOne, numTwo);
				System.out.println("The result is: " + add.result + "\n");
			}
			else if(s.equals("s"))
			{
				System.out.println("Enter number one: ");
				float numOne = scan.nextFloat();
				System.out.println("Enter number two: ");
				float numTwo = scan.nextFloat();

				sub.Subtraction(numOne, numTwo);
				System.out.println("The result is: " + sub.result + "\n");
			}
			else if(s.equals("m"))
			{
				System.out.println("Enter number one: ");
				float numOne = scan.nextFloat();
				System.out.println("Enter number two: ");
				float numTwo = scan.nextFloat();

				multiply.Multiplication(numOne, numTwo);
				System.out.println("The result is: " + multiply.result + "\n");
			}
			else if(s.equals("d"))
			{
				System.out.println("Enter number one: ");
				float numOne = scan.nextFloat();
				System.out.println("Enter number two: ");
				float numTwo = scan.nextFloat();

				div.Division(numOne, numTwo);
				System.out.println("The result is: " + div.result + "\n");
			}
			else if(s.equals("q"))
			{
				quit = true;
			}
			else
			{
				System.out.println("Please try again." + "\n");
			}

			// creates a delay based on the value saved in timer
			try {
				TimeUnit.SECONDS.sleep(timer);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}while (!quit);

		System.out.println("Exiting...");
	}
}
