/*Definition :-Arrays.sort() method consists of two variations one in which we do not pass any arguments where it
sort down the complete array be it integer array or character array but if we are supposed to sort a specific part
using this method of Arrays class then we overload it and pass the starting and last index to the array.
  Test case :-
    Output :
The original array is: 
5 -2 23 7 87 -42 509 
The sorted array is: 
-42 -2 5 7 23 87 5098*/ 

 
import java.util.Arrays;

class Sorting {
	public static void main(String args[])
	{
		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
		System.out.println("The original array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		Arrays.sort(arr);
		System.out.println("\nThe sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
