/*Definition Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.
  test case :-Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.*/
package Arraysalllprogrambysharddadidi;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class SubArray {
    public static void main(String[] args) {
        int max=0;
        int current =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n =sc.nextInt();
        int  a[] = new int[n];
        System.out.println("enter the element of the array");
        for(int i=0; i<n;i++){
            a[i] =sc.nextInt();

        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        for(int i=0 ; i<a.length;i++){
            current=current+a[i];
        }
        if(current>max){
            max=current;
        }
       if(current<0){
        current=0;
       }

    
    
    System.out.println(max);
    
}
}
