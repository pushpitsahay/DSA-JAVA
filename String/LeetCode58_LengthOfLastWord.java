// https://leetcode.com/problems/length-of-last-word/
class Solution{
    public int lengthOfLastWord(String s){
        String ans=s.trim();
        int count=0;
        for(int i=ans.length()-1; i>=0 ; i--){
            if(ans.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
