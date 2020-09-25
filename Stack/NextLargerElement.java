
class solve{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        Stack <Long> s=new Stack<>();
        int i=n-1;
        long ans[]=new long[n];
        
        while(i>=0){
            
            while(!s.isEmpty() && arr[i]>=s.peek()){
                s.pop();
            }
            
            if(s.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=s.peek();
            }
            
            s.push(arr[i]);
            i--;
        }
        
        return ans;
        
    } 
}
