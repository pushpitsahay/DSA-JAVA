// https://leetcode.com/problems/left-and-right-sum-differences/
class Solution{
    public int[] leftRightDifference(int[] nums){
        int ans[]=new int[nums.length];
        int leftSum=0;
        int rightSum=0;
        for(int i=0; i<nums.length; i++){
            leftSum+=nums[i];
        }
        for(int i=0; i<nums.length; i++){
            leftSum-=nums[i];
            ans[i]=Math.abs(leftSum-rightSum);
            rightSum+=nums[i];
        }
        return ans;
    }
}
