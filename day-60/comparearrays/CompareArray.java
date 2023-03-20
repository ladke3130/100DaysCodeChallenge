/* Definition :-How to Compare Two Arrays in Java | Array Programs in Java – 8 | 
In the previous Java program, we find the sum of two array elements. Now in this post, we will see how to compare two arrays in Java.

Compare Two Arrays in Java:- If two arrays are having the same reference or same length and they contain 
similar elements then both arrays are equal else they are not equal.
Test case :-
output :-
arr1 & arr2 are same
arr1 & arr3 are not same
arr1 & arr4 are not same*/
public class CompareArray {
  public static void main(String[] args) {
    // declare and initialize arrays
    int arr1[] = {10,20,30,40,50};
    int arr2[] = arr1;
    int arr3[] = {10,20,30,40,50};
    int arr4[] = {15,25,35,45,55};
    
    // compare arrays using == operator
    // compare arr1 and arr2
    if(arr1 == arr2)
      System.out.println("arr1 & arr2 are same");
    else 
      System.out.println("arr1 & arr2 are not same");
    
    // compare arr1 and arr3
    if(arr1 == arr3)
      System.out.println("arr1 & arr3 are same");
    else 
      System.out.println("arr1 & arr3 are not same");
    
    // compare arr1 and arr4
    if(arr1 == arr4)
      System.out.println("arr1 & arr4 are same");
    else 
      System.out.println("arr1 & arr4 are not same");
  }
  }
