// https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75
public class LeetCode151_ReverseWordsInAString{
    public static void main(String[] args){
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }
    static String reverseWords(String s){
        String str[]=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1; i>=0; i--){
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
