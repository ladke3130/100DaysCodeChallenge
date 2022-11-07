//Factorial defination :- Factorial of n is the product of all posotive decending integer .Factorial of n is denoted by n!.
 // Test case 1 : 
  iput :
 enter any number : 5
   output : 120 
 // Test case  2: 
     input :
   enter any number :2
     output : 2

import java.util.Scanner;
public class Factorial {
    public static void main (String [] args){
        System.out.println("enter the number");
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int i ,fact=1;
        for(i=1; i<=number; i++){
            fact= fact*i;
        }
        System.out.println("Factorial of " +number + " is :"+fact);
    }
}
