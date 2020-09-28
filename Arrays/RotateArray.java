class Solution
{
    static void rotateArr(int arr[], int d, int n)
    {
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
            
        }
        
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        
        int idx=0;
        for(int i=n-d;i<n;i++){
            arr[i]=temp[idx];
            idx++;
        }
        
        
    }
}
