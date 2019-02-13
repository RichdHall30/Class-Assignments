	import java.util.*;
public class Playing_With_Strings 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String Name;
		String fName;
		String fUpper;
		int space;
		String lName;
		String lUpper;
		String letter;
		String search;
		
		System.out.print("Please enter your First and Last name: ");
			Name = in.nextLine();
		space = Name.indexOf(" ");
		
		fName = Name.substring(0,space);
		lName = Name.substring(space + 1);
		
		fUpper = fName.substring(0,1).toUpperCase() + fName.substring(1);
		lUpper = lName.substring(0,1).toUpperCase() + lName.substring(1);
		
		Name = fUpper + " " + lUpper;
		
		System.out.println(Name);
//Part 2		
		System.out.print("Enter a letter to search for: ");
			letter = in.nextLine();
			
		if (Name.indexOf(letter)!= -1)
	{	
		System.out.println("The letter " + letter + " is at index " + Name.indexOf(letter));
	}
	else 
	{
		System.out.println("The letter " + letter + " does not exist in " + Name);
	}
//Part 3		
		System.out.print("Enter a string to search for: ");
			search = in.nextLine();
			
		if (Name.indexOf(search) != -1)
		{
			
		System.out.println("The string " + search + " starts at index " + Name.indexOf(search));
		
		}
		
		else
		{
			System.out.println("The string " + search + " does not exist in " + Name);
		}

	}

}
