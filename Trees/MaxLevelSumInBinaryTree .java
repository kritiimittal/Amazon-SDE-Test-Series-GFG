class GfG {
    public int maxLevelSum(Node root) {
        
       if(root==null){
           return 0;
       }
       int max=root.data;
       Queue<Node> q=new LinkedList<>(); 
       q.add(root);
       while(!q.isEmpty()){
          
          int sum=0; 
          int s=q.size();
          for(int i=0;i<s;i++){
              
            Node temp=q.remove();
            sum+=temp.data;
            if(temp.left!=null){
                q.add(temp.left);            
            }
            
            if(temp.right!=null){
                q.add(temp.right);            
            }
          }
          if(sum>max){
              max=sum;
          }
       }
       
       return max; 
    }
}
