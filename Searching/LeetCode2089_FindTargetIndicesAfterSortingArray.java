// https://leetcode.com/problems/find-target-indices-after-sorting-array/
class Solution{
    public List<Integer> targetIndices(int[] nums, int target){
        Arrays.sort(nums);
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                al.add(i);
            }
        }
        return al;
    }
}
