/*Definition :-Given two given arrays of equal length, the task is to find if given arrays are equal or not.
  Two arrays are said to be equal if both of them contain the same set of elements and in the same order. 

Test case:

Input  : arr1[] = {1, 2, 5, 4, 0};
         arr2[] = {1, 2, 5, 4, 0}; 
Output : Yes

Input  : arr1[] = {1, 2, 5, 4, 0, 2};
         arr2[] = {2, 4, 5, 0}; 
Output : No
 
Input : arr1[] = {1, 7, 7};
        arr2[] = {7, 7, 1};
Output : No*/
// Java Program to find the if the arrays are equal

import java.util.Arrays;

public class CheckArraysEqual {
	public static void main(String[] args)
	{
		// Initializing the first array
		int a[] = { 30, 25, 40 };

		// Initializing the second array
		int b[] = { 30, 25, 40 };

		// store the result
		// Arrays.equals(a, b) function is used to check
		// whether two arrays are equal or not
		boolean result = Arrays.equals(a, b);

		// condition to check whether the
		// result is true or false
		if (result == true) {
			// Print the result
			System.out.println("Two arrays are equal");
		}
		else {
			// Print the result
			System.out.println("Two arrays are not equal");
		}
	}
}
