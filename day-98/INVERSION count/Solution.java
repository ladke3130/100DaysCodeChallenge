 /*Definiton :For an array, inversion count indicates how far (or close) the array is from being sorted.
 If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
TEST CASE :

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).*/
class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return mergeSort(arr, 0, N - 1);
    }
    static long mergeSort(long arr[], long low, long high){
        long res = 0;
        if(low < high){
            long mid = low + (high - low) / 2;
            res += mergeSort(arr, low, mid);
            res += mergeSort(arr, mid + 1, high);
            res += countAndMerge(arr, low, mid, high);
        }
        return res;
    }
    static long countAndMerge(long arr[], long low, long mid, long high){
        long n1 = mid - low + 1;
        long n2 = high - mid;
        long[] left = new long[(int)n1];
        long[] right = new long[(int)n2];
        for(int i = 0; i < n1; i++){
            left[i] = arr[(int)low + i];
        }
        for(int i = 0; i < n2; i++){
            right[i] = arr[(int)mid + 1 + i];
        }
        long i = 0, j = 0, res = 0, k = low;
        while(i < n1 && j < n2){
            if(left[(int)i] <= right[(int)j]){
                arr[(int)k] = left[(int)i];
                i++;
                k++;
            }else if(right[(int)j] < left[(int)i]){
                arr[(int)k] = right[(int)j];
                j++;
                k++;
                res = res + (n1 - i);
            }
        }
        while(i < n1){
            arr[(int)k] = left[(int)i];
            i++;
            k++;
        }
        while(j < n2){
            arr[(int)k] = right[(int)j];
            j++;
            k++;
        }
        return res;
        
    }
}

 
