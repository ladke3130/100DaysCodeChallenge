//Definition:- In Java, Arrays is the class defined in the java.util package that provides sort() method to sort an array in ascending order. 
//It uses Dual-Pivot Quicksort algorithm for sorting. Its complexity is O(n log(n)).
//It is a static method that parses an array as a parameter and does not return anything. We can invoke it directly using the class name.
//Test case :-
//Output:
//Array elements in ascending order: 
5 
12 
22 
23 
34 
67 
90 
109

import java.util.Arrays;   
public class SortArray  
{   
public static void main(String[] args)   
{   
//defining an array of integer type   
int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
//invoking sort() method of the Arrays class  
Arrays.sort(array);   
System.out.println("Elements of array sorted in ascending order: ");  
//prints array using the for loop  
for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
}  
