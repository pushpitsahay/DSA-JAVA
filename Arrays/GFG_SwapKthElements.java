// https://www.geeksforgeeks.org/problems/swap-kth-elements5500/1?page=1&category=Arrays&difficulty=School&sortBy
class Solution {
    void swapKth(int arr[], int n, int k) {
        // code here
        int temp=arr[k-1];
        arr[k-1]=arr[n-k];
        arr[n-k]=temp;
    }
}
