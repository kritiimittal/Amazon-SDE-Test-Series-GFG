class Celebrity
{
    // The task is to complete this function
    int getId(int arr[][], int n)
    {
       Stack<Integer> s=new Stack<>();
       
       for(int i=0;i<n;i++){
           s.push(i);
           
       }
       
       while(s.size()>1){
           int s1=s.pop();
           int s2=s.pop();
           if(arr[s1][s2]==1){
               s.push(s2);
           }else{
               s.push(s1);
           }
           
       }
       
       int t=s.pop();
       for(int i=0;i<n;i++){
           
         if(i!=t){
             
             if(arr[t][i]==1 || arr[i][t]==0){
                 return -1;
             }
         }  
           
       }
       
       return t;
    }
}
