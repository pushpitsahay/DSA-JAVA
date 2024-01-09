// https://www.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1?page=1&category=Strings&difficulty=Easy,Medium&status=solved&sortBy=submissions
class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        StringBuilder sb=new StringBuilder("-1");
        for(int i=0; i<arr[0].length(); i++){
            boolean flag=false;
            for(int j=1; j<arr.length; j++){
                if(i>=arr[j].length() || arr[0].charAt(i)!=arr[j].charAt(i)){
                    flag=true;
                    break;
                }
            }
            if(flag)break;
            sb.append(arr[0].charAt(i));
        }
        if(sb.length()==2){
            return sb.toString();
        }
        String ans=sb.toString();
        return ans.substring(2);
    }
}
