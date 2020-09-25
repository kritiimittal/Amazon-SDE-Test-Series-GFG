class Majority
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        if(size==1){
            return a[0];
        }
        
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<size;i++){
            if(h.containsKey(a[i])){
                int c=h.get(a[i])+1;
                if(c>size/2){
                    return a[i];
                }else{
                    h.put(a[i],c);
                }
                
            }
            else{
                    
                    h.put(a[i],1);
                }
            
            
        }
        return -1;
        
    }
}
