//User function Template for Java

class Platform
{
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(dep);
        Arrays.sort(arr);
        int i=0;
        int j=0;
        int p=0;
        int max=Integer.MIN_VALUE;
        while(i<n && j<n){
            
            if(arr[i]<=dep[j]){
                p++;
                i++;
                max=Math.max(p,max);
                
            }else{
                
                p--;
                j++;
            }
            
        }
    return max;
        
    }
    
}

