class BinaryTree
{
    /* Computes the number of nodes in a tree. */
    static ArrayList<Integer> preorder(Node root)
    {
        Stack<Node> s=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        s.push(root);
        while(!s.isEmpty()){
            
            Node t=s.pop();
            ans.add(t.data);
            if(t.right!=null){
                s.push(t.right);
            }
            
            
            if(t.left!=null){
                s.push(t.left);
            }
        }
       
       return ans; 
    }

}
