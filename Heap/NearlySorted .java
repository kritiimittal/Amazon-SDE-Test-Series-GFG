class solve{

    ArrayList <Integer> nearlySorted(int arr[], int num, int k){
        
        ArrayList <Integer> ans=new ArrayList <Integer> ();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
            
        }
        
        for(int i=k;i<num;i++){
            
            ans.add(pq.remove());
            pq.add(arr[i]);
            
        }
        
        while(pq.size()!=0){
            ans.add(pq.remove());
        }
        
        return ans;
    }
}
