//Defination :- As we know that java array is an object which contains elements of a similar data type.
  //to declare an array ,we define the variable type with square brackets.
 //program :- Find largest and smallest elements of an array.
Sample input :- 
  Enter the elements[0]
  76
  Enter the elements[1]
  87
  Enter the elements [2]
  09
  Enter the elements[3]
  89
  Enter the elements[4]
  56
  Enter the elements[5]
  76
  Enter the elements[6]
  33
  Enter the elements [7]
  12
  Enter the elements [8]
  43
  Enter the elements [9]
  24
  Sample output :- Largest is 89 and Smallest is 9 
    Testcase 1 :- if take decimal number from the user as an input 
    Input :- 34.4
public class TestArray {
    public static void main(String[] args) {
            double[] myList = {1.9, 2.9, 3.4, 3.5};
            // Print all the array elements
            for (int i = 0; i < myList.length; i++) {
                System.out.println(myList[i] + " ");
            }
            // Summing all elements
            double total = 0;
            for (int i = 0; i < myList.length; i++) {
                total += myList[i];
            }
            System.out.println("Total is " + total);
            // Finding the largest element
            double max = myList[0];
            for (int i = 1; i < myList.length; i++) {
                if (myList[i] > max) max = myList[i];
            }
            System.out.println("Max is " + max);
        }
    }


