//Definition :-To calculate the average of numbers given in the Java array, first, 
/*we need to calculate the sum and then find the average using sum / number_of_array_elements.
  Test case :- 
    input :-
      array[] = {10, 20, 30, 40, 50};
      
output:-
then sum of array elements = 10 + 20 + 30 + 40 + 50 = 150
and the average of numbers = 150 / 5 = 30*/
public class ArrayAverage {
  public static void main(String[] args) {

    double array[] = {10, 20, 30, 40, 50};
    // declare sum variable, & initialize with 0
    double sum = 0.0;
    // declare average variable
    double avg = 0.0;

    // loop to iterate the array
    for (int i=0; i<array.length; i++) {
      // add numbers
      sum = sum + array[i];
    }

    // calculate the average value
    avg = sum/array.length;

    // display result
    System.out.println("Average: " + avg );
  }
}
