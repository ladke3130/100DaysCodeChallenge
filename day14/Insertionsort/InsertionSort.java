//Defination :- We can create a java program to sort array elements using insertion sort. 
 // Insertion is good for small elements only because it requires more time for sorting large number of elements.
//Test case :
//input:-
//Before Insertion Sort
//output:-
//9 14 3 2 43 11 58 22 
//After Insertion Sort
//2 3 9 11 14 22 43 58 
//Time Complexity
//Best: ?(n^2)
//Average: ?(n^2)
//Worst: O(n^2)
//Space Complexity
//O(1)

public class InsertionSortExample {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }   
    public static void main(String a[]){ 
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
