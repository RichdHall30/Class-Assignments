/**
 * 
 * @author Rich Hall
 * @version 2/6/2019
 * @description: This program will randomly generate a number that corresponds to a card from
 * 				a standard deck of 52 playing cards and displays that card to the user.
 * 
 *  @Pseudocode After prompting the user to start the game with a simple yes or no question,
 *  		The program will randomly generate two numbers. One to represent a suit and one to
 *  		represent a face value. The program will then display the resulting card's face value and
 *  		suit to the user.
 */
	import java.util.*;		//Imports wildcard. Whatever's necessary
public class Program_1_Pick_A_Card 
{

	public static void main(String[] args) 
	{
			System.out.println("ID001");
		
		Scanner in = new Scanner(System.in);
		double randNum = Math.random();
		String choice;
		double faceValue;
		double suit;
		
		
		
			System.out.print("Would you like to pick a card? Y/N ");
				choice = in.nextLine();
					
			if (choice.charAt(0) == 'Y' || choice.charAt(0) == 'y' )	//User decides to pick a card
			{
				faceValue = (randNum*(13)+ 1);		//Random number Min 1, Max 13
				suit = (randNum * 4);				//Random number Min 0, Max 3
				
				System.out.print("You got a" );
				
					switch ((int)faceValue)
					{
					case (1):	//Ace
						System.out.print("n ace");
						break;
					
					case (2): case (3): case (4): case (5): case (6): case (7): case(8):		//Number valued card
					case (9): case (10):
						
						System.out.print(" " + (int)faceValue);
						break;
					
					case (11):	//Jack
					{
						System.out.print(" Jack");
						break;
					}
					
					case (12):	//Queen
					{
						System.out.print(" Queen");
						break;
					}
					
					case (13):	//King
					{
						System.out.print(" King");
						break;
					}
						
					}
					
					switch ((int)suit)
					{
					case (0): //Hearts
					{
						System.out.print(" of Hearts");
						break;
					}
					
					case (1): //Diamonds
					{
						System.out.print(" of Diamonds");
						break;
					}
					
					case (2): //Clubs
					{
						System.out.print(" of Clubs");
						break;
					}
					
					case (3): //Spades
					{
						System.out.print(" of Spades");
						break;
					}
					}
			}
			else if (choice.charAt(0) == 'N' || choice.charAt(0) == 'n')		//User decides not to pick a card, Terminates program
			{
				System.out.println("Maybe next time!");
			}
			else
				System.out.println("invalid input");	//User's first decision is invalid. Terminates program
	}

}
