/*Definition :-Arrays are the special variables that store multiple values under the same name in the contiguous memory allocation.
  Elements of the array can be accessed through their indexes.
  Test case 1 :-
    Elements of given array:
1	2    3    4    5*/
    
public class PrintArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Elements of given array: ");  
        //Loop through the array by incrementing value of i  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  
