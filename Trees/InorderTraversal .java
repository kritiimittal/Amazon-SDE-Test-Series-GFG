class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
       
        ArrayList<Integer>  ans=new ArrayList<Integer>();
        if(root==null){
            return ans;
        }
        
        Stack <Node> s=new Stack<>();
        Node curr=root;
        while(curr!=null || !s.isEmpty()){
           
           while(curr!=null){
               s.push(curr);
               curr=curr.left;
               
           }
           
           Node t=s.pop();
           ans.add(t.data);
           curr=t.right;
           
           
       }
      
      return ans; 
    }
    
    
}
