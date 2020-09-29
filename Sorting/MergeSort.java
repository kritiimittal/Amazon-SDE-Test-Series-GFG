
/* The task is to complete merge() which is used
in below mergeSort() */
class GfG
{
   // Merges two subarrays of arr[].  First subarray is arr[l..m]
   // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
         int len=r-l+1;
         int ans[]=new int[len];
         int i=l;
         int j=m+1;
         int k=0;
         while(i<=m && j<=r){
             if(arr[i]<=arr[j]){
                 ans[k]=arr[i];
                 i++;
             }else{
                 ans[k]=arr[j];
                 j++;
             }
             
             k++;
             
         }
         
         while(i<=m){
             ans[k]=arr[i];
             i++;
             k++;
             
         }
         
         while(j<=r){
             ans[k]=arr[j];
             j++;
             k++;
             
         }
         
         
         for(int t=l;t<=r;t++){
             arr[t]=ans[t-l];
         }
    }
    
}

 /* This method is present in a class other than GfG class .
static void mergeSort(int arr[], int l, int r)
 {
    GfG g = new GfG();
    if (l < r)   
   {
        int m = (l+r)/2;
        mergeSort(arr, l, m);
        mergeSort(arr , m+1, r);
        g.merge(arr, l, m, r);
    }
}*/
