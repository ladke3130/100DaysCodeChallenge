/*Definition :-A Collection is a group of individual objects represented as a single unit.
Java provides Collection Framework which defines several classes and interfaces to represent a group of objects as a single unit. 
Test case:
Input : List = [3, 5, 18, 4, 6]
Output:
Min value of our list : 3
max value of our list : 18

Input : List = ['a', 'a', 'a']
Output:
All elements are equal*/
// Java Program to Compare Elements in a Collection
import java.io.*;
import java.util.*;

class Framework {
	public static void main(String[] args)
	{
		// List initialization
		List<Integer> l = new ArrayList<>();

		// Add elements in the list
		l.add(3);
		l.add(5);
		l.add(18);
		l.add(4);
		l.add(6);

		// Minimum in the list
		int minimum = Collections.min(l);

		// Maximum in the list
		int maximum = Collections.max(l);

		if (minimum == maximum) {
			System.out.println("All elements are equal");
		}
		else {
			System.out.println("Min value of our list : "
							+ minimum);
			System.out.println("Max value of our list : "
							+ maximum);
		}
	}
}


