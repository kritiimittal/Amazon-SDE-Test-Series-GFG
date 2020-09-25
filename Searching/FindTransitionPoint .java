class GfG {
    int transitionPoint(int arr[], int n) {
        
        if(arr[0]==0 && arr[n-1]==0){
            return -1;
        }
        if(arr[0]==1 && arr[n-1]==1){
            return 0;
        }
        
        int ans=-1;
        for(int i=1;i<arr.length;i++){
            
            if(arr[i-1]==0 && arr[i]==1){
               ans=i;
               break;
            }
        }
        return ans;
    }
}
