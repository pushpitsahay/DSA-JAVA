// https://www.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&category=Searching&status=solved&sortBy=submissions
class Solution{
    int binarysearch(int arr[], int n, int k){
        // code here
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(k>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
