class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    
	    int nz=0;
	    int i=0;
	    while(i<n){
	        if(arr[i]==0){
	           int temp=arr[nz];
	           arr[nz]=arr[i];
	           arr[i]=temp;
	           nz++;
	           i++;
	        }else{
	            i++;
	        }
	        
	        
	    }
	    
	    return arr;
	    
	} 
} 
