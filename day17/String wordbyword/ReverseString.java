//Defination :- Reverse of the String word by word.
//Test case 1 :-
//  Input:- Enter the String :-
      //     my name is nikita
  // Output :-atikin si eman ym
  

import java.util.Scanner;  
public class ReverseString
{  
public static void main(String[] args)   
{  
String str;  
System.out.println("Enter a string: ");  
Scanner scanner = new Scanner(System.in);  
str = scanner.nextLine();  
scanner.close();                                
String reversed = reverseString(str);  
System.out.println("The reversed string is: " + reversed);  
}  
public static String reverseString(String s)  
{  
if (s.isEmpty())                            
return s;  
return reverseString(s.substring(1)) + s.charAt(0);                
}  
}  
