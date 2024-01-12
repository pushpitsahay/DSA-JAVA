// https://leetcode.com/problems/missing-number/
class Solution{
    public int missingNumber(int[] nums){
        int N=nums.length;
        int Sum=0;
        int totalSum=N*(N+1)/2;
        for(int i=0; i<N; i++){
            Sum+=nums[i];
        }
        return totalSum-Sum;
    }
}
