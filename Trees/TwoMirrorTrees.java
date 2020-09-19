class Tree {
    boolean areMirror(Node a, Node b) {
        if(a==null && b==null){
            return true;
        }
        
        if(a==null || b==null){
            return false;
        }
        
        if(a.data==b.data ){
            
            return areMirror(a.left, b.right) && areMirror(a.right, b.left) ;
        }
        return false;
        
    }
}
