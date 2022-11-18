//Defination:-A number is prime if it is divisible by 1 and itself. In other words, 
//a prime number is a natural number with exactly two distinct natural number divisors 1 and itself. For example, 2, 3, 5, 7, 11, etc. 
 // are the prime numbers. Note that 0 and 1 are not prime numbers. The number 2 is the only even prime number because all the other even numbers are divisible by 2. 
//In this section, we will learn how to find the nth prime number in Java.v
Test case 1 :-
 // Output 1 :- Enter the value of n to compute the nth prime number: 3
The 5th prime number is: 5
//Output 2:
Enter the value of n to compute the nth prime number: 25
The 25th prime number is: 97
import java.util.Scanner;  
public class NthPrimeNumbers  
{  
public static void main(String[] args)   
{  
//constructor of the Scanner class  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the value of n to compute the nth prime number: ");  
//reading an integer from the user  
int n = sc.nextInt();   
int num=1, count=0, i;  
while (count < n)  
{  
num=num+1;  
for (i = 2; i <= num; i++)  
{   
    if (num % i == 0)   
{   
break;  
}  
}  
if (i == num)  
{  
 
count = count+1;  
}  
}    
System.out.println("The " +n +"th prime number is: " + num);  
}  
}  
