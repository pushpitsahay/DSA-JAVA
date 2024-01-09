// https://www.geeksforgeeks.org/problems/perfect-arrays4645/1?page=1&category=Arrays&difficulty=School&sortBy=submissions
class Solution{
    public boolean IsPerfect(int a[], int n){
        // Complete the function
        int low = 0;
        int high = n-1;
        while(low<high){
            if(a[low] != a[high]){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
