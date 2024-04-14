// https://leetcode.com/problems/climbing-stairs/
class Solution{
    public int climbStairs(int n){
        // n=1:1, n=2:2, n=3:3, n=4:5, n=5:8
        // 1,2,3,5,8,13...   For n=4: Sum of last two (2+3=5) Fibonacci
        if(n<=3) return n;
        int a=1, b=2, temp=0;
        for(int i=3; i<=n; i++){
            temp=a+b;
            a=b;
            b=temp;
        }
        return temp;
    }
}
