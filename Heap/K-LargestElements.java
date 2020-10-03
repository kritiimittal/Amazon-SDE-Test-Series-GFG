class Solution
{
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++){
            
            if(i<k){
                pq.add(arr[i]);
            }else{
                
                if(pq.peek()<arr[i]){
                    pq.remove();
                    pq.add(arr[i]);
                    
                }
            }
        }
        
        while(pq.size()!=0){
            
            ans.add(0,pq.remove());
            
        }
        
        return ans;
        
    }
}
