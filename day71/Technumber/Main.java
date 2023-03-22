Defiition :-A number is called a tech number if the
given number has an even number of digits and the number can be 
divided exactly into two parts from the middle. After equally dividing the number, sum up the numbers and find the square of the sum.
If we get the number itself as square, the given number is a tech number, else, not a tech number. For example, 3025 is a tech number.
Test case :-
output :-Enter a number to check: 2025
2025 is a tech Number.
import java.util.Scanner;  
public class Main
{  
public static void main(String args[])  
{  
int n, num, firstHalf, secondHalf, digits = 0, squareOfSum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number to check: ");  
//reads an integer from the user  
n = sc.nextInt();  
//assign the value of n into num  
num = n;  
//the loop executes until the condition returns false  
while (num > 0)  
{  
//incerements the variable digits by 1      
digits++;  
//removes the last digit of the given number  
num = num / 10;  
}  
//check if the given number has an even number of digits or not  
if (digits % 2 == 0)  
{  
num = n;  
//determines the first half of the given number  
firstHalf = num % (int) Math.pow(10, digits / 2);  
//determines the second half of the given number  
secondHalf = num / (int) Math.pow(10, digits / 2);  
//calculate the square of both the numbers  
squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);  
//compares the square of the sum with the given number  
if (n == squareOfSum)  
{  
System.out.println(n+" is a tech number.");  
}  
else  
{  
System.out.println(n+" is not a tech number.");  
}  
}  
else  
{  
System.out.println(n+ " is not a tech number.");  
}  
}  
}  
