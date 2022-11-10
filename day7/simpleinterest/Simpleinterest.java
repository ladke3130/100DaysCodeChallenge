//Defination : Simple interest is a quick method of calculating the intrest charge on a loan .simple interest determined by multipying 
//the daily interest rate by the principle by the number of days that elapse between payments.
 // formula : (p*r*t)/100
// Test case 1 :-  
//input: enter the value of P
       enter the value of R
       enter the value of T
       7
       8
       9
//output:- simple interest :-5.04
  
  
  import java .util.Scanner;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the valur of P");
        System.out.println("enter the value of R");
        System.out.println("enter the value of T");
        
        float P=sc.nextFloat();
        float R= sc.nextFloat();
        float T = sc.nextFloat();
        float SI = (P*T*R)/100;
        System.out.println("Simple interest = "+SI);
    }

    
}
