// https://leetcode.com/problems/single-number/
class Solution{
    public int singleNumber(int[] nums){
        // Using XOR operator
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}
