class Solution {
    int MissingNumber(int array[], int n) {
        
        int sum=(n*(n+1))/2;
        int t=0;
        for(int i=0;i<array.length;i++){
            t+=array[i];
        }
        
        return sum-t;
    }
}
