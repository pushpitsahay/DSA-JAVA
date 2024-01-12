// https://leetcode.com/problems/plus-one/
class Solution{
    public int[] plusOne(int[] digits){
        int ans[]=new int[digits.length+1];
        ans[0]=1;
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        return ans;
    }
}
