/**
 * @author Rich Hall
 * @version 2/13/2019
 * @Description This program is a collection of programs that can be run 
 * 				from a simple, easy to read menu interface.
 * 
 * @Pseudocode The user will select one of five options displayed by typing their
 * 		selection and pressing enter. 
 * 		*Program 1 asks for three test grades and displays the average of the provided
 * 			grades
 * 		*Program 2 rolls a six sided die and allows the user to guess whether the die landed
 * 			on an even number or an odd number and displays the outcome of the game
 * 		*Program 3 accepts user input for the radius of a circle and uses that information
 * 			to calculate the area of the circle
 * 		*Program 4 accepts user input for two points on a graph (x,y) and (x,y) and calculates
 * 			the distance between those two points
 * 		*Program 5 is an escape option. Terminates the program
 */
	import java.util.*;		//Imports java utilities for use (Scanner)
public class R_Hall_Assignment_1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("1. Lab Test Average Calculator \n"
						 + "2. Dice Roll \n"
						 + "3. Circle Area Calculator \n"
						 + "4. Compute Distance \n"
						 + "5. Quit");
		System.out.print("Please select an option to proceed: ");
		int option = in.nextInt();
		
		switch (option)		//Allows program to run only the selected option
		{
		case 1:	//Lab Test Average Calculator
			
			double grade1, grade2, grade3;
			double average;
			
				System.out.println("\nWelcome to Lab test Average Calculator! \n");
				System.out.println("This program will calculate and display\nthe average of "
								+ "three lab test grades.\n");
				System.out.print("Please enter three lab test grades ");
					grade1 = in.nextDouble();
					grade2 = in.nextDouble();
					grade3 = in.nextDouble();
					
						average = ((grade1 + grade2 + grade3)/3);	//average = sum of all grades / number of grades
				
				System.out.println("The average is " + average);
		break;	//Ends program after running case 1
		
		case 2:	//Dice Roll
			
			int rand = (int) (Math.random()*(6 - 1 + 1) + 1);		//Random integer: Min 1, Max 6
			String guess;
			
				System.out.println("\nWelcome to \"Dice Roll\" the Game! \n");
				System.out.println("This program will roll a die and you have to\nguess even or odd. \n");
			
				System.out.println("Rolling die...\n\n");
			
				System.out.print("Do you think the die landed on (E)ven or (O)dd? ");
					guess = in.next();
				
				if ((guess.charAt(0) == 'E' || guess.charAt(0) == 'e') && ((rand % 2) == 0))	//If guess is even and random number is even
				{
					System.out.println("Correct!");
					System.out.println("The Die landed on " + rand + " and you chose even!");
				}
				else if ((guess.charAt(0) == 'O' || guess.charAt(0) == 'o') && ((rand % 2) != 0))	//If guess is odd and random number is odd
				{
					System.out.println("Correct!");
					System.out.println("The Die landed on " + rand + " and you chose odd!");
				}
				else 			//If guess and random number are not compliments
				{
					System.out.println("You guessed incorrectly!");
					System.out.println("The Die landed on " + rand );
				}
		break;		//Ends program after running case 2
		
		case 3:	//Circle Area Calculator
			double radius;
			final double pi = 3.14;		//Pi never changes
			double area;
			
				System.out.println("\nWelcome to Circle Area Calculator!\n\n"
						+ "This program will tell you the area of a circle after\n"
						+ "you input its radius.\n");
				System.out.print("Please enter the Radius of your circle: ");
					radius = in.nextDouble();
					
						area = (pi * (Math.pow(radius, 2)));		//area = (pi * r^2)
					
				System.out.println("The area of your circle is " + area);
			
		break;		//Ends program after running case 3
		
		case 4:	//Compute Distance
			double x1;
			double x2;
			double y1;
			double y2;
			
				System.out.print("\nWelcome to Compute Distance! \n\n"
						+ "This program will calculate the distance between\n"
						+ "two points on a graph.\n\n");
				
				System.out.print("Please enter the first point x,y with a space instead of a comma: ");
					x1 = in.nextDouble();
					y1 = in.nextDouble();
					
				System.out.print("Please enter the second point x,y with a space instead of a comma: ");
					x2 = in.nextDouble();
					y2 = in.nextDouble();
					
						double distance = Math.pow(((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2)), 0.5);	//distance = sqrt((x-x)^2 + (y-y)^2)
					
				System.out.println("Calculating...\n\n"
						+ "The distance between point (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")\n"
								+ "is " + distance);
						
				
		break;		//Ends program after running case 4
		
		case 5: //Quit
			
			System.out.print("\nGoodbye!");
			
		break;		//Unnecessary because the program ends here anyway :)
			
		}	

	}

}
