// https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75
class Solution{
    public void moveZeroes(int[] nums){
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]==0){
                i++;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp; 
                i++;
                j++;
            }
        }
    }
}
