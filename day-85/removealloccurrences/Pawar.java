/* definition:- Given an array and a key, the task is to remove all occurrences of the specified key from the array in Java. Examples:

Input: array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }, key = 3
Output: [9, 2, 1, 7, 2, 5]

Input: array = { 10, 20, 10, 30, 50, 10 }, key = 10
Output: [20, 30, 50]*/
// Java program remove all occurrences
// of an element from Array using naive method

import java.util.Arrays;

class Pawar {

	// function to remove all occurrences
	// of an element from an array
	public static int[] removeElements(int[] arr, int key)
	{
		// Move all other elements to beginning
		int index = 0;
		for (int i=0; i<arr.length; i++)
			if (arr[i] != key)
				arr[index++] = arr[i];

		// Create a copy of arr[]
		return Arrays.copyOf(arr, index);
	}

	// Driver code
	public static void main(String[] args)
	{
		int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
		int key = 3;
		array = removeElements(array, key);
		System.out.println(Arrays.toString(array));
	}
}
