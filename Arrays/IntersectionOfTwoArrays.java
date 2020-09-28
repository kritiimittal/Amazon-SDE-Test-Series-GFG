public static int NumberofElementsInIntersection (int a[], int b[] , int n, int m)
{
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<a.length;i++){
        
        if(map.containsKey(a[i])){
            int v=map.get(a[i])+1;
            map.put(a[i],v);
        }else{
            map.put(a[i],1);
        }
    }
    
    int c=0;
    for(int i=0;i<b.length;i++){
    
        if(map.containsKey(b[i])){
            c++;
            map.remove(b[i]);
         }
    
    }
    
    return c;
}
