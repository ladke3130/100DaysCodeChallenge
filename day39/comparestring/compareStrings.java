/*Definition :- this program, you'll learn to compare two strings in Java.

To understand this example, you should have the knowledge of the following Java programming topics:

Test case 1 :
input :- strng 1 :- Bold
         string 2:- Gold
         
         '
 output :- not equal*/
public class CompareStrings {

    public static void main(String[] args) {

        String style = new String("Bold");
        String style2 = new String("Bold");

        if(style.equals(style2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
