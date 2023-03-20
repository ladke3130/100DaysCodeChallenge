/*Definition:-The octal numbers are numbers with 8 base and use digits from 0-7. 
  This system is a base 8 number system. The decimal numbers are the numbers with 10 as their 
base and use digits from 0-9 to represent the decimal number. They also require dot to represent decimal fractions.
Test case :-
output :-Decimal equivalent of Octal value 157 is: 111*/
public class Conversion {

public static void main(String args[])
	{
		// octal value
		String onum = "157";

		// octal to decimal using Integer.parseInt()
		int num = Integer.parseInt(onum, 8);

		System.out.println(
			"Decimal equivalent of Octal value 157 is: "
			+ num);
	}
}
