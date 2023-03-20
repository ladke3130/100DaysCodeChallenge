//Definition:-How to remove an element from an array in Java by index or by value.
//Test case :-
/*input:-
  Original array: [10, 20, 30, 40, 50]
  output:-
New array: [10, 20, 30, 50]*/
import java.util.Arrays;
public class ArrayTest {

   public static void main(String[] args) {
      // original array
      int arr[] = { 10, 20, 30, 40, 50 };

      // index of element to be removed 
      int index = 3;

      // display old array
      System.out.println("Original array: " + Arrays.toString(arr));

      // remove
      arr = removeElement(arr, index);

      // display new array
      System.out.println("New array: " + Arrays.toString(arr));
   }
  public static int[] removeElement(int[] arr, int index) {

      // if array is null or index is negative or more then size 
      // return original array
      if(arr == null || index < 0 || index >= arr.length) {
         System.out.println("Invalid array or index.");
         return arr;
      }
      
      // create new array of size-1
      int temp[] = new int[arr.length-1];
      
      // copy and skip at index
      for (int i = 0, j = 0; i < arr.length; i++) {
         if(i == index) {
            continue;
         }
         temp[j++] = arr[i];
      }

      return temp;
   }
}
