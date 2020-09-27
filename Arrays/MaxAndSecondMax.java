class ArrayMax{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
       ArrayList<Integer> ans=new ArrayList<Integer>();
       int max=-1;
       int sm=-1;
       
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            sm=max;
            max=arr[i];
        }    
        
        if(arr[i]<max && arr[i]>sm){
            sm=arr[i];
        }   
           
       }
       
       ans.add(max);
       ans.add(sm);
       return ans;
    }
}
