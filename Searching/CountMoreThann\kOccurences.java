class CountElement {

    // Function to find element with count more than n/k times
    // arr: input array
    public int countOccurence(int[] arr, int n, int k) {
        // your code here,return the answer
        
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=n-1;i++){
            if(map.containsKey(arr[i])){
                int t=map.get(arr[i])+1;
                map.put(arr[i],t);
                
            }else{
                map.put(arr[i],1);
            }
            
            
        }
        
       // Set<Integer> key=map.Keyset();
        for(Integer key : map.keySet()){
            if(map.get(key)>n/k){
                ++count;
            }
            
        }
        return count;
        
    }
}
