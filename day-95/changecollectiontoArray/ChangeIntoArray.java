/*Definition :-The array is a linear data structure containing elements whose size is defined at the 
time of creation and can hold both object and primitive homogeneous data.
The collection is a predefined class holding only heterogeneous object types but primitive. 
Method of java utility class can be used to change a collection to an array in java.
Test case :-
Output:  
Geeks for Geeks is the Best*/
// Java program to change Collection to an array

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;

// Or simply add all generic lava libraries
import java.util.*;

public class ChangeIntoArray {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating arrayList list dynamically
		List<String> list = new ArrayList<String>();
		// List is created

		// Adding elements to the list
		list.add("Geeks ");
		list.add("for ");
		list.add("Geeks ");
		list.add("is ");
		list.add("the ");
		list.add("Best.");

		// Converting list to an array
		String[] str = list.toArray(new String[0]);

		// Iterating over elements of array
		for (int i = 0; i < str.length; i++) {
			String data = str[i];

			// Printing elements of an array
			System.out.print(data);
		}
	}
}
