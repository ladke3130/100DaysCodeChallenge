/*Definition :-Collection is a set of objects that hold references to other objects in the program. In doing the same we already have studied a data
structure- HashMap which internally works out the same way.
So we come up with one of the approaches to print a Collection in java that is through HashMap. Now a step further we encounter- a collection framework.
Test case :-
Output
Name : John | Roll No : 101
Name : Paul | Roll No : 102
Name : Jack | Roll No : 103
Name : Jose | Roll No : 10*/
// Java program printing ArrayList
// of an user-defined collection

// Importing Classes/Files
import java.util.*;

public class Collection {
	String firstName;
	String lastName;

	// Constructor
	GFG(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
	}

	// Function- toString()
	public String toString()
	{
		// Over-riding the toString method to print the
		// collection
		return "| First Name : " + firstName
			+ " | LastName : " + lastName;
	}

	// Driver Main Method
	public static void main(String[] args)
	{
		// Creating a hashmap with key as ID and
		// value as user defined class
		HashMap<Integer, GFG> hm
			= new HashMap<Integer, GFG>();

		// creating objects
		GFG p1
			= new GFG("Mohit", "Singh");
		GFG p2
			= new GFG("Tarun", "Anand");
		GFG p3
			= new GFG("Madhu", "Singh");
		GFG p4
			= new GFG("Rohit", "Ahuja");

		// adding mappings
		hm.put(101, p1);
		hm.put(102, p2);
		hm.put(103, p3);
		hm.put(104, p4);

		// Iterating HashMap through for loop and printing the collection
		for (Map.Entry m : hm.entrySet())
			System.out.println(m.getKey() + " "
							+ m.getValue().toString());
	}
}
