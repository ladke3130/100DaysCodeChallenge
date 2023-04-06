/*Definition :-Given a collection of Intervals, the task is to merge all of the overlapping Intervals.

Test case :

Input:
Intervals = {{1,3},{2,4},{6,8},{9,10}}
Output: {{1, 4}, {6, 8}, {9, 10}}
Explanation: Given intervals: [1,3],[2,4]
[6,8],[9,10], we have only two overlapping
intervals here,[1,3] and [2,4]. Therefore
we will merge these two and return [1,4],
*/
class Solution
{
    public int[][] overlappedInterval(int[][] arr)
    {
        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(arr, (x,y) -> x[0] - y[0]);
        int miN = arr[0][0];
        int maX = arr[0][1];
        for(int[] a:arr){
            if(a[0]<= maX){
                maX = Math.max(a[1],maX);
            }
            else{
                result.add(new int[]{miN,maX});
                miN = a[0];
                maX = a[1];
            }
        }
        result.add(new int[]{miN,maX});
        return result.toArray(new int[0][]);
        
    }
}
