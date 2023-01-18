/*Definition :-In this program, we need to check whether a given string is palindrome or not.

A string is said to be palindrome if it is the same from both the ends.
  For e.g. above string is a palindrome because if we try to read it from backward, it is same as forward.
    One of the approach to check this is iterate through the string till middle of string and compare a character from back and forth.
    Test case 1 :- 
      output :- Given string is palindrome */


public class PalindromeString    
{    
    public static void main(String[] args) {    
        String string = "Kayak";    
        boolean flag = true;    
            
        //Converts the given string into lowercase    
        string = string.toLowerCase();    
            
        //Iterate the string forward and backward, compare one character at a time     
        //till middle of the string is reached    
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
    }    
}    
