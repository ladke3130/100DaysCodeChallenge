//Defination :-in this program ,we will see how to find the compound interest using the formula when the value are user defined .this means first we will ask the user to initialize the variabless ,and then we will find the compound interest using the formula.
 // TEST CASE 1 :- 
   // Input :- 
     // Enter the principle amount : 5200
     // Enter the rate of interest : 12
     // Enter the time period : 3
     // Enter the number of times that interest is compound per unit t :2
    //    output : 
     // Compound Interest after 3.0 year :6.117696E8
     // Amound after 3.0 years : 6.117696E8

import java.util.*;
public class Main
{
    public static void main(String args[]) 
    {
        //Take input from the user
        //Create an instance of the Scanner class
    	Scanner sc = new Scanner(System.in);
        //Declare variables
        float p, r, t, n;
        System.out.println("Enter the Principal : ");
        p = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Rate of interest : ");
        r = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Time period : ");
        t = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the number of times that interest is compounded per unit t");
        n=sc.nextFloat();      //Initialize the variables
        sc.close();
        
        //Calculate the compound interest
    	double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
}

Enter the Principal amount: 5200
Enter the Rate of interest: 12
Enter the Time period: 3
Enter the number of times that interest is compounded per unit t: 
        
     
