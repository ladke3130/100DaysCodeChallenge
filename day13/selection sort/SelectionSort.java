//Defination :-We can create a java program to sort array elements using selection sort. 
 // In selection sort algorithm, we search for the lowest element and arrange it to the proper location. We swap the current element with the next lowest number.
//Test case :-
//  Input :- Before selection sort 
  9 7 3 2 56 11 58 22
 //   output :- After selection sort
    2 3 7 9 11 22 56 58
   // Time Complexity
Best: ?(n^2)
Average: ?(n^2)
Worst: O(n^2)
//Space Complexity
O(1)
  
public class SelectionSort {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         ystem.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
