// https://www.geeksforgeeks.org/problems/display-longest-name0853/1?page=1&category=Arrays&difficulty=School&sortBy=submissions
class GFG {
    String longest(String names[], int n) {
        String longest=names[0];
        for(int i=1; i<n; i++){
            if(names[i].length() > longest.length()) //Geeks>Geek
            { 
                longest=names[i];
            }
        }
        return longest;
    }
}
