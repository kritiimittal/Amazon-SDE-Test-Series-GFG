class Solution
{
    // A[] : the input array of positive integers
    // N : size of the array arr[]
    // X : the required sum
    public boolean keypair(int[] A, int N, int X)
    {
      HashMap<Integer,Integer> map=new HashMap<>();
        
    for(int i=0;i<N;i++){
        if(map.containsKey(X-A[i])){
            return true;
        }
        map.put(A[i],i);
    }
    
    return false;
    }
}
