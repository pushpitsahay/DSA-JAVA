// https://leetcode.com/problems/add-digits/
class Solution{
    public int addDigits(int num){
        int sum=0;
        while(num>0 || sum>9){
            if(num==0){
                num=sum;
                sum=0;
            }
            sum=sum+(num%10);
            num=num/10;
        }
        return sum;
    }
}
