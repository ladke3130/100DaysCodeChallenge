//Definition :-In this program, we need to replace all the spaces present in the string with a specific character.

//String: Once in a blue moon
//String after replacing space with '-': Once-in-a-blue-moon
//One of the approach to accomplish this is by iterating through the string to find spaces. If spaces are present, 
//then assign specific character in that index. Other approach is to use a built-in function replace function to replace space with a specific character.
//Test case 1 :-
 // Output :-String after replacing spaces with given character: 
//Once-in-a-blue-moon
public class StringSpace    
{    
    public static void main(String[] args) {    
        String string = "Once in a blue moon";    
        char ch = '-';    
            
        //Replace space with specific character ch    
        string = string.replace(' ', ch);    
            
        System.out.println("String after replacing spaces with given character: ");    
        System.out.println(string);    
    }    
}      
