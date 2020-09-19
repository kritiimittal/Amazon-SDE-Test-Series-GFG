class Tree
{
    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        int max=Integer.MIN_VALUE;
        q.add(root);
        while(!q.isEmpty()){
            
            int s=q.size();
            max=Math.max(max,s);
            for(int i=0;i<s;i++){
                
                Node temp=q.remove();
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            
          
        }
        return max;  
    }		
}
