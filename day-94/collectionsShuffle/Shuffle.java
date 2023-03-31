/*Definition :-shuffle() method of Collections class as the class name suggests is present in utility 
  package known as java.util that shuffles the elements in the list.
  Test case :-
    Output:-Original List : 


Shuffled List : 
[quiz, quiz, geeksforgeeks, code, practice, qa]*/
// Java program to demonstrate
// working of shuffle() method
// of Collections class

// Importing utility classes
import java.util.*;

// Main class
public class GFG {
	
	// Main driver method
	public static void main(String[] args)
	{
		// Creating an empty ArrayList of string type
		ArrayList<String> mylist = new ArrayList<String>();

		// Adding custom input elements to list object
		mylist.add("code");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");
		mylist.add("quiz");
		mylist.add("practice");
		mylist.add("qa");

		// Printing list before shuffling
		System.out.println("Original List : \n" + mylist);

		// Shuffling the list
		Collections.shuffle(mylist);

		// Printing list after shuffling
		System.out.println("\nShuffled List : \n" + mylist);
	}
}
