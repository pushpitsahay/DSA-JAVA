// https://www.geeksforgeeks.org/problems/ishaans-internship4400/1?page=1&category=Searching&status=solved&sortBy=submissions
class Solution{
    int getCandidate(int n, int k){
        //complete the function here
        int count=0;
        while(n>=k){
            n/=k;
            count++;
        }
        return (int)Math.pow(k,count);
    }
}
