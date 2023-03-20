//Definition :-How to count repeated elements in an array in Java programming language.
//If the array is sorted then counting repeated elements in an array will be easy compare to the unsorted array.
/*Test case 1:- 
Input:-
Array = { 10, 10, 10, 20, 20, 30, 40, 50, 60, 70 }
output:-
Total Repeated elements: 2
Repeated elements are: 10 20

  */
public class ArrayTest {

   public static void main(String[] args) {

      // original array
      int arr[] = { 50, 20, 10, 40, 20, 10, 10, 60, 30, 70};
      
      // create another array of similar size
      int temp[] = new int[arr.length];
      int count = 0;
      
      // traverse original array
      for(int i=0; i<arr.length; i++) {
         
         int element = arr[i];
         boolean flag = false;
        for(int j=0; j<count; j++) {
            if(temp[j] == element) {
               flag = true;
               break;
            }
         }
         
         // if already exist then don't check
         if(flag) {
            continue;
         }
         
         // check occurrence of element
         for(int j=i+1; j<arr.length; j++) {
            if(arr[j] == element) {
               temp[count++] = element;
               // found, therefore break
               break;
              }
         }
      }
      
      // display total repeated elements
      System.out.println("Total Repeated elements: " + count);
      // display repeated elements
      System.out.println("Repeated elements are: ");
      for (int i = 0; i < count; i++) {
         System.out.print(temp[i]+" ");
      }      
   }
}
