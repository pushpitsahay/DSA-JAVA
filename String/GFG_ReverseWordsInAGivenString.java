// https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1?page=1&category=Strings&difficulty=Easy,Medium&status=solved&sortBy=submissions
class Solution{
    //Function to reverse words in a given string.
    String reverseWords(String S){
        // code here
        String []str=S.split("[.]");
        String str1="";
        for(int i=str.length-1;i>=0;i--){
            str1+=str[i];
            if(i>0){
                str1+=".";
            }
        }
        return str1;
    }
}
