class Sort012
{
    // The function should do the stated modifications in the given array arr[]
    // Do not return anything.
    
    // arr[]: Input Array
    // N: Size of the Array arr[]

    public static void segragate012(int arr[], int n){
        
        int nz=0;
        int nt=n-1;
        int i=0;
        while(i<=nt){
            
            if(arr[i]==1){
                i++;
            }else if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[nz];
                arr[nz]=temp;
                i++;
                nz++;
            }else{
                int temp=arr[i];
                arr[i]=arr[nt];
                arr[nt]=temp;
                nt--;
            }
            
        }
    }
}
