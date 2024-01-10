// https://www.geeksforgeeks.org/problems/count-the-zeros2550/1?page=1&category=Searching&status=solved&sortBy=submissions
class Solution{
    int countZeroes(int[] arr, int n){
        // code here
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                count++;
            }
        }
        return count;
    }
}
