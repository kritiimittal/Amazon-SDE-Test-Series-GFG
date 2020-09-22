class Tree
{
	int minDepth(Node root)
	{
	    if(root==null){
	        return 0;
	    }
	    
	    int l=minDepth(root.left);
	    int r=minDepth(root.right);
	    if(l==0 && r!=0){
	        return r+1;
	        
	    }
	    
	    if(l!=0 && r==0){
	        return l+1;
	    }    
	    
	    return l<r?l+1:r+1;
	    
	}
}

