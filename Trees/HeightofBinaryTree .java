class Tree
{
    // return the Height of the given Binary Tree
    int height(Node root) 
    {
        if(root==null){
            return 0;
        }
        
        int l=height(root.left);
        int r=height(root.right);
        return l>r?l+1:r+1;
    }   
}
