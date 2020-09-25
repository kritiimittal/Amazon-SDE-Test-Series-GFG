class Tree
{
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
     int height(Node root){
         if(root==null){
             return 0;
         }
         
         int l=height(root.left);
         int r=height(root.right);
         
         return l>r?l+1:r+1;
     }
     
     
     
    boolean isBalanced(Node root)
    {
    if(root==null){
        return true;
    }    
    int l=height(root.left);
    int r=height(root.right);
    if(Math.abs(l-r)<=1){
        
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    return false;
    }
}

