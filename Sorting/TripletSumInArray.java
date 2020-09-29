//User function Template for Java

class TripletSum
{
    // arr[] : The input Array
    // N : Size of the Array
    // X : Sum which you need to search for 
    
    public static int find3Numbers(int arr[], int n, int x) { 
    
      Arrays.sort(arr);
      for(int i=0;i<n;i++){
          
        int l=i+1;
        int r=n-1;
        while(l<r){
            
            if(arr[i]+arr[l]+arr[r]==x){
                return 1;
            }else if(arr[i]+arr[l]+arr[r]<x){
                l++;
                
            }else{
                r--;
            }
        }
         
          
      }
    
    return 0;
    }
}
