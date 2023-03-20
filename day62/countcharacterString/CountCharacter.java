/*Definition :-In this program, we need to count the number of characters present in the string:

The best of both worlds

To count the number of characters present in the string,
we will iterate through the string and count the characters.
In above example, total numbers of characters present in the string are 19.
Test case :
Output :-
Total number of characters in a string: 19*/
public class CountCharacter    
{    
    public static void main(String[] args) {    
        String string = "The best of both worlds";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
    }    
}     
