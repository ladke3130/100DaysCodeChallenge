/*Definition :-Given a decimal number as input, we need to write a program to convert the given decimal number into an equivalent binary number.

Test case :-

Input : 7
Output : 111
s
Input : 10
Output : 1010

Input: 33
Output: 100001*/

// Java program to convert a decimal
// number to binary number
import java.io.*;

class conversiondeci
{
	// function to convert decimal to binary
	static void decToBinary(int n)
	{
		// array to store binary number
		int[] binaryNum = new int[1000];

		// counter for binary array
		int i = 0;
		while (n > 0)
		{
			// storing remainder in binary array
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}

		// printing binary array in reverse order
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}
	
	// driver program
	public static void main (String[] args)
	{
		int n = 17;
		System.out.println("Decimal - " + n);
		System.out.print("Binary - ");
		decToBinary(n);
  }
}
