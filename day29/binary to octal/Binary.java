/*Definition :-
A Binary Number System is composed of two symbols : 0’s (zeroes) and 1’s (ones), which represent low or Off and high or On state respectively in digital electronics. 
  It is primarily a number system with the base-2 and is extensively used in computer science as well. 
  All the data is stored in the binary symbols in computers which are also called bits.
  The Binary System derives its name from the fact that it is composed of just two symbols. A Binary Number can also be thought of as a string of just 0’s and 1’s.

An Octal Number System comprises if eight digits ranging from 0 to 7.
  It derives its name from the fact that it consists of eight digits (hence Oct) which means eight.
  It is an 8-base number system and can be formulated by grouping the bits in a binary number in groups of three and calculating 
  the corresponding value of each group as a single digit in the resultant Octal Number.

Example:Input : 100100
Output: 44

Input : 1100001
Output : 141*/
// Java program to convert binary to octal

class GFG {

	// function to convert binary number
	// to decimal number
	int binaryToDecimal(long binary)
	{

		// variable to store the converted
		// decimal number
		int decimalNumber = 0, i = 0;

		// loop to convert binary to decimal
		while (binary > 0) {

			// extracting every digit of the
			// binary and multiplying with
			// increasing powers of 2
			decimalNumber
				+= Math.pow(2, i++) * (binary % 10);

			// dividing the number by 10
			// to remove the last digit
			binary /= 10;
		}

		// returning the converted decimal
		// number
		return decimalNumber;
	}

	// function to convert decimal number
	// to octal
	int decimalToOctal(long binary)
	{

		// variable to store the octal number
		int octalNumber = 0, i = 0;

		// variable to store the output
		// returned by the binaryToDecimal()
		int decimalNumber = binaryToDecimal(binary);

		// loop to convert decimal to octal
		while (decimalNumber != 0) {

			// extracting the remainder on
			// multiplying by 8 and
			// dividing that with increasing
			// powers of 10
			octalNumber += (decimalNumber % 8)
						* ((int)Math.pow(10, i++));

			// removing the last digit by
			// dividing by 8
			decimalNumber /= 8;
		}

		// returning the converted octal number
		return octalNumber;
	}

	// Driver Code
	public static void main(String[] args)
	{

		// instantiating the class
		GFG ob = new GFG();

		// calling and printing the
		// decimalToOctal() function
		System.out.println(ob.decimalToOctal(1001001));
	}
}
