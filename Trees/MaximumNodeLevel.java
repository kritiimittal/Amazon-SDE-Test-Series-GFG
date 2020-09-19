class Tree
{
    // Return the level (0-indexed) with maximum number of nodes.
    public static int maxNodeLevel(Node root)
    {
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       
       int max=Integer.MIN_VALUE;
       int ml=-1;
       int level=0;
       while(!q.isEmpty()){
        
         int s=q.size();
         if(s>max){
             max=s;
             ml=level;
         }
           
         for(int i=0;i<s;i++){
            Node t=q.remove();
            if(t.left!=null){
                q.add(t.left);
            }
            
            if(t.right!=null){
                q.add(t.right);
            } 
         }  
           level++;
       }
       return ml;
       
    }
}
