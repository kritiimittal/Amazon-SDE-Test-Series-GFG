class Sol
{
    public static ArrayList<Integer>findPairs(int arr[], int n) 
    { 
        
        HashMap<Integer,Boolean> map=new HashMap<>();
    	
    	
    	ArrayList<Integer> ans=new ArrayList<Integer>();
    	for(int i=0;i<n;i++){
    	 
    	 if(map.containsKey(-1*arr[i])){
    	     if(arr[i]<0){
    	         ans.add(arr[i]);
    	         ans.add(-1*arr[i]);
    	     }else{
    	         ans.add(-1*arr[i]);
    	         ans.add(arr[i]);
    	     }
    	     
    	     map.remove(arr[i]);
    	     
    	 } else{
    	     map.put(arr[i],true);
    	 }  
    	    
    	} 
    	
    	return ans;
    }
}
