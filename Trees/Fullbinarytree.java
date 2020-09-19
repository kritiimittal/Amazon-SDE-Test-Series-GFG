class GfG
{
    // Return True if the given Binary Tree is a Full Binary Tree. Else return False
	boolean isFullTree(Node node)
    {
        if(node==null){
            return true;
        }
        
        if(node.left==null && node.right==null){
            return true;
        }
        if(node.left==null || node.right==null){
            return false;
        }
        
        return isFullTree(node.left) && isFullTree(node.right);
        
        
    }
}
