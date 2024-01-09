// https://www.geeksforgeeks.org/problems/palindrome-string0817/1?page=1&category=Strings&difficulty=Easy,Medium&status=solved&sortBy=submissions
class Solution {
    int isPalindrome(String S) {
        // code here
        StringBuilder sb=new StringBuilder(S);
        sb.reverse();
        if(S.equals(sb.toString())) return 1;
        else return 0;
    }
};
