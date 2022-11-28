//Definition :- In this program, we need to print the element which is present on even position.
 // Even positioned element can be found by traversing the array and incrementing the value of i by 2.
//Program to print the elements of an array present on even position.
//Test case 1 :- 
//  Input :- {1,2,3,4,5}
//Output :- Elements of given array present on even position:
2
4
 //Test case 2 :-
  // Input :- {1,2,3,4,5,6,7,8,9}
// Elements of given array present on even position:
2
4
6
8
public class EvenPosition {  
    public static void main(String[] args) {  
  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
  
        System.out.println("Elements of given array present on even position: ");  
        //Loop through the array by incrementing value of i by 2  
        //Here, i will start from 1 as first even positioned element is present at position 1.  
        for (int i = 1; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        }  
    }  
}  
