//Definition :-In this program, we need to rotate the elements of array towards
//its right by the specified number of times. An array is said to be right rotated if all elements of the array are moved to
//its right by one position. One approach is to loop through the array by shifting each element of the array to its next position. 
//  The last element of the array will become the first element of the rotated array.
//Java Program to right rotate the elements of an array
//Consider the above array, if n is 1 then, all elements of the array will be moved to its right by one position that is the first element of the array
//will take the second position, the second element will be moved to the third position and so on. The last element of the array will become the 
//first element of the array.
Test case :-
  Original Array:
1   2   3   4   5
Array after right rotation:
3   4   5   1   2
  

class RotateRight {    
 public static void main(String[] args) {    
        //Initialize array     
        int [] arr = new int [] {1, 2, 3, 4, 5};     
        //n determine the number of times an array should be rotated.    
        int n = 3;    
           
        //Displays original array    
        System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");     
        }     
    for(int i = 0; i < n; i++){    
            int j, last;    
            //Stores the last element of array    
            last = arr[arr.length-1];    
            
            for(j = arr.length-1; j > 0; j--){    
                //Shift element of array by one    
                arr[j] = arr[j-1];    
            }    
            //Last element of array will be added to the start of array.    
            arr[0] = last;    
        }    
        
        System.out.println();    
            
        //Displays resulting array after rotation    
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
         System.out.print(arr[i] + " ");    
        }    
    }    
}    