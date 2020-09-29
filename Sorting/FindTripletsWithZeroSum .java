class Triplet
{
    // Function to check if triplet is present 
    // arr[]: input array
    // n: size of the array
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
             
             if(arr[i]+arr[l]+arr[r]==0){
                 
                 return true;
             }else if(arr[i]+arr[l]+arr[r]<0){
                 
                 l++;
             }else{
                 r--;
             }   
                
                
                
            }
            
        }
        
        return false;
    }
}
