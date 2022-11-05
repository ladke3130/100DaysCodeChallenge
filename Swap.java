 //Swapping Defination :  Swapping two variable refers to matually exchanging the values of the variables .
 // Test case 1 :-input
 enetr a = 7
 enter b = 8
 output
 After swapping 
 a = 8
 b= 7 
 // Text case 2 : 
 enter a = 23
 enetr b = 25 
 output 
 After Swapping 
 a = 25
 b = 23 
 
import java.util.Scanner ;
public class Swapnumber {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        System.out.print("enter a ");
       int  a = sc.nextInt();
       System.out.print("enter b ");
       int b = sc.nextInt();

       int c;
        c =a;
        a=b;
        b=c;
        System.out.println("after swaping ");import java.util.Scanner ;
 System.out.println("values in a:" +a);
        System.out.println("values in b :" +b);

    }
}
