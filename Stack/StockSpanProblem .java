class solve{
    
    // Function to calculate span
    // price[]: input array
    public static int[] calculateSpan(int price[], int n)
    {
        
        int ans[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && price[i]>=price[s.peek()]){
                s.pop();
            }
            
            if(s.isEmpty()){
                ans[i]=i+1;
            }else{
                ans[i]=i-s.peek();
            }
            
            s.push(i);
        }
        
        return ans;
        
    }
    
}
