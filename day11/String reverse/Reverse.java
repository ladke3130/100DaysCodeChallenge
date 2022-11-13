//Defination :- In this program, we need to find the reverse of the string. 
 // This can be done by iterating the string backward and storing each character from the original string into a new string. 
//Test case 1 :- 
//Input :-
Orignal String : Big Demo
//output:-
    Reverse of String :- omeD giB
//Test case 2 :-
 // Input :- 
 Orignal String : Nikita Ladke
// Output :
    Reverse of String : ekdaL atikiN

public class Reverse   
{    
    public static void main(String[] args) {    
        String string = "Dream big";    
            
        String reversedStr = "";        
        for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    
 
    System.out.println("Original string: " + string);        
    System.out.println("Reverse of given string: " + reversedStr);   
}
}
