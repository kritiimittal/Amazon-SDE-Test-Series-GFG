class FindMissing{
    
    // Function to find 
    static int findMissing(int arr[], int size)
    {
       
       int t[]=new int[size+1];
       for(int i=0;i<arr.length;i++){
           
           if(arr[i]>0 && arr[i]<=size){
            t[arr[i]]++;   
           }
           
       }
       
       for(int i=1;i<t.length;i++){
           if(t[i]==0){
               return i;
           }
       }
       
       return size+1;
    }
}
