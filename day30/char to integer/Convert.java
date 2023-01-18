/*Definition :-As we are aware char in Java takes 1 byte while int takes 4 bytes. So if we want integer getting converted to character than we need to
typecast because data residing in 4 bytes can not get into a single byte. 
  So prior moving ahead readers must have to be well verse with typecasting in java.
  Test case 1 :-
    Input  : N = 74254 
Output : Seven four two five four
Test case 2 :-
Input  : N = 23 
Output : Two three */
  
// Java Program to Convert Integer to Characters

// Importing input output classes
import java.io.*;

// Main class
public class GFG {

	// Method 1
	// To convert number to a character
	static void NumbertoCharacter(String s)
	{
		// Iterating the number taking one digit at a time
		// via switch case using length() method
		for (int i = 0; i < s.length(); i++) {

			// Switch case
			// Reading digits one by one
			// using charAt() method
			switch (s.charAt(i)) {

			// Case 1
			case '1':
				System.out.print("one ");

				// Break statement to hault
				// normal execution of the program
				break;

			// Case 2
			case '2':
				System.out.print("two ");
				break;

			// Case 3
			case '3':
				System.out.print("three ");
				break;

			// Case 4
			case '4':
				System.out.print("four ");
				break;

			// Case 5
			case '5':
				System.out.print("five ");
				break;

			// Case 6
			case '6':
				System.out.print("six ");
				break;

			// Case 7
			case '7':
				System.out.print("seven ");
				break;

			// Case 8
			case '8':
				System.out.print("eight ");
				break;

			// Case 9
			case '9':
				System.out.print("nine ");
				break;

			// Case 10
			case '0':
				System.out.print("zero ");
				break;

			// Default case
			default:
				System.out.print("InValid ");
				break;
			}
		}
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{

		// Custom input Integer
		int n = 12345;

		// Calling the above function
		NumbertoCharacter(n + "");
	}
}
