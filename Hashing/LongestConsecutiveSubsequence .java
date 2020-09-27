class Subseq
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    // return the length of the longest subsequene of consecutive integers
	static int findLongestConseqSubseq(int arr[], int N)
	{
	  
	  HashMap<Integer,Boolean> map=new HashMap<>();
	  for(int i=0;i<N;i++){
	      map.put(arr[i],true);
	  }
	  
	  for(int i=0;i<N;i++){
	   if(map.containsKey(arr[i]-1)){
	       map.put(arr[i],false);
	   }   
	  }
	  
	  int ml=-1;
	  for(int i=0;i<N;i++){
	   if(map.get(arr[i])==true){
	       int tsp=arr[i];
	       int tl=1;
	       while(map.containsKey(tsp+tl)){
	           tl++;
	       }
	   
	   ml=Math.max(ml,tl);    
	   }   
	  }    
	  
	  return ml;
	}
}
