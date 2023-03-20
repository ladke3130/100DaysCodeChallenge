/*Definition :-To calculate the sum of two arrays element by element in Java both arrays must be of equal type and
equal size. If they have different types or different sizes then we will get IllegalArgumentException. To solve this problem we have to create a 
third array of the same size and then store the sum of corresponding elements of the given arrays.
Test case :-
Output :
Enter number of elements in first array: 5
Enter number of elements in second array: 5
Enter first array elements:
10 20 30 40 50
Enter second array elements:
9 18 27 36 45
Resultant Array: [19, 38, 57, 76, 95]*/
import java.util.Scanner;
import java.util.Arrays;

public class TwoArraySum {
  public static void main(String[] args) {

    // create Scanner class object
    Scanner scan = new Scanner(System.in);

    // take number of elements in both array
    System.out.print("Enter number of elements in first array: ");
    int array1size = scan.nextInt();
    System.out.print("Enter number of elements in second array: ");
    int array2size = scan.nextInt();

    // both array must have same number of elements
    if(array1size != array2size) {
      System.out.println("Both array must have "+
                      "same number of elements");
      return; 
    }

    // declare three array with given size
    int array1[] = new int[array1size];
    int array2[] = new int[array1size];
    int array3[] = new int[array1size];
    // take input for array1 elements
    System.out.println("Enter first array elements: ");
    for (int i=0; i<array1.length; i++) {
      array1[i] = scan.nextInt();
    }

    // take input for array2 elements
    System.out.println("Enter second array elements: ");
    for (int i=0; i<array2.length; i++) {
      array2[i] = scan.nextInt();
    }

    // loop to iterate through the array
    for (int i=0; i<array3.length; i++) {
      // add array elements
      array3[i] = array1[i] + array2[i];
    }

    // display the third array
    System.out.println("Resultant Array: " 
        + Arrays.toString(array3));
  }
}
