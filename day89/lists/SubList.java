/* Definition :-Here we are given a list and the task is to split it into two news lists as one can better perceive from the below illustration as follows:

Test case :

Input  : list = {1, 2, 3, 4, 5, 6}
Output : first = {1, 2, 3}, second = {4, 5, 6}

Input  : list = {1, 2, 3, 4, 5}
Output : first = {1, 2}, second = {3, 4, 5}*/
// Java Program to Split a List into Two Sublist

// Importing required classes
import java.util.ArrayList;
import java.util.List;

// Main class
public class SubList {

	// Method 1
	// To split a list into two sublists in Java
	public static List[] split(List<String> list)
	{

		// Creating two empty lists
		List<String> first = new ArrayList<String>();
		List<String> second = new ArrayList<String>();

		// Getting size of the list
		// using size() method
		int size = list.size();

		// Step 1
		// (First size)/2 element copy into list
		// first and rest second list
		for (int i = 0; i < size / 2; i++)
			first.add(list.get(i));

		// Step 2
		// (Second size)/2 element copy into list first and
		// rest second list
		for (int i = size / 2; i < size; i++)
			second.add(list.get(i));

		// Returning a List of array
		return new List[] { first, second };
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{

		// Creating an ArrayList of string type
		List<String> list = new ArrayList<String>();

		// Adding elements to list object
		// using add() method
		list.add("Geeks");
		list.add("Practice");
		list.add("Contribute");
		list.add("IDE");
		list.add("Courses");

		// Calling split method which return List of array
		List[] lists = split(list);

		// Printing specific elements of list by
		// passing arguments with in
		System.out.println(lists[0]);
		System.out.println(lists[1]);
	}
}
