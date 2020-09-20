class Tree
{
    // Return 1 if all the nodes in the tree satisfy the given property. Else return 0
    public static int isSumProperty(Node root)
    {
        if(root==null || (root.left==null && root.right==null)){
            return 1;
        }
        int s=(root.left!=null ? root.left.data:0)+
        (root.right!=null ? root.right.data:0);
        if(s!=root.data){
            return 0;
        }
        
        int l= isSumProperty(root.left); 
        int r=isSumProperty(root.right);
        if(l==1 && r==1){
            return 1;
        }
        
        return 0;
    }
}
