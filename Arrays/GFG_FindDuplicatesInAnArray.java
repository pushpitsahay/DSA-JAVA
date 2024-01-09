// https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays&difficulty=Easy,Medium&status=solved&sortBy=submissions
class Solution{
    public static ArrayList<Integer> duplicates(int arr[], int n){
        // code here
        Arrays.sort(arr);
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                hs.add(arr[i]);
            }
        }
        ArrayList<Integer> al=new ArrayList<>(hs);
        Collections.sort(al);
        if(al.size()==0){
            al.add(-1);
        }
        return al;
    }
}
