// https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&category=Algorithms&status=solved&sortBy=submissions
class Solution{
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        // Your code here
        long curSum=0;
        long maxSum=Long.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            curSum=curSum+arr[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }
}
