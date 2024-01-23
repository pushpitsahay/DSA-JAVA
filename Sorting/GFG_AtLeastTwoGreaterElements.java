// https://www.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1?page=1&category=Sorting&status=solved&sortBy=submissions
class Solution{
    public long[] findElements( long a[], long n){
        // Your code goes here
        Arrays.sort(a);
        ArrayList<Long> li= new ArrayList<>();
        
        for(int i=0; i<n-2; i++){
            li.add(a[i]);
        }
        long[] ans = new long[li.size()];
        for(int i=0;i<li.size();i++){
            ans[i] = li.get(i);
        }
        return ans;
    }
}
