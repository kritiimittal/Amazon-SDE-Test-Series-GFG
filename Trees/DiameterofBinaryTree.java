class Tree {
    /* Complete the function to get diameter of a binary tree */
    int diameter(Node root) {
     
     if(root==null){
         return 0;
     }
     
     int o1=diameter(root.left);
     int o2=diameter(root.right);
     int o3=height(root.left)+height(root.right)+1;
     
     return Math.max(o1,Math.max(o2,o3));
    }
    
    int height(Node root) {
     if(root==null){
         return 0;
     }   
     
     int l=height(root.left);
     int r=height(root.right);
     return l>r?l+1:r+1;
        
    }
}
