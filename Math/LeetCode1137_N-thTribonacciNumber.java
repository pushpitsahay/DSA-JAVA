// https://leetcode.com/problems/n-th-tribonacci-number/?envType=daily-question&envId=2024-04-24
class Solution{
    public int tribonacci(int n){
        //T0=0, T1=1,T2=1, T3=T0+T1+T2=0+1+1=2, T4=T1+T2+T3=1+1+2=4
        int arr[]={0,1,1};
        if(n<=2) return arr[n];
        for(int i=3; i<=n; i++){
            int temp=arr[0]+arr[1]+arr[2];
            arr[0]=arr[1];
            arr[1]=arr[2];
            arr[2]=temp;
        }
        return arr[2];        
    }
}
