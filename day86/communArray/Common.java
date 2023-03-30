/*Definition :-Given two arrays and our task is to find their common elements. 
Test case :

Input:  Array1 = [“Article”, “for”, “Geeks”, “for”, “Geeks”], 
            Array2 = [“Article”, “Geeks”, “Geeks”]
Output: [Article,Geeks]

Input:  Array1 = [“a”, “b”, “c”, “d”, “e”, “f”], 
            Array2 = [“b”, “d”, “e”, “h”, “g”, “c”]
Output: [b, c, d, e]*/
// Java Program to find common elements
// in two Arrays
// Using iterative method

import java.io.*;
import java.util.*;

class Common {
	private static void FindCommonElemet(String[] arr1,
										String[] arr2)
	{
		Set<String> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {

					// add common elements
					set.add(arr1[i]);
					break;
				}
			}
		}
		for (String i : set) {
			System.out.print(i + " ");
		}
	}

	// main method
	public static void main(String[] args)
	{

		// create Array 1
		String[] arr1
			= { "Article", "in", "Geeks", "for", "Geeks" };

		// create Array 2
		String[] arr2 = { "Geeks", "for", "Geeks" };

		// print Array 1
		System.out.println("Array 1: "
						+ Arrays.toString(arr1));

		// print Array 2
		System.out.println("Array 2: "
						+ Arrays.toString(arr2));

		System.out.print("Common Elements: ");

		// Find the common elements
		FindCommonElemet(arr1, arr2);
	}
}
