class Solution 
{ 
    static int Search(int array[], int target)
	{
	    // code here
	    int index=-1;
	    for(int i=0;i<array.length;i++){
	        if(target==array[i]){
	            index=i;
	            break;
	        }
	    }
	    return index;
	}
} 

