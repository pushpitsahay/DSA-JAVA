// https://leetcode.com/problems/search-insert-position/
class Solution{
    public int searchInsert(int[] nums, int target){
        // Using Binary Search
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(target>nums[mid]) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}