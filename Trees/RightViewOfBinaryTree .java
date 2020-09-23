class Tree{
    ArrayList<Integer> rightView(Node node) {
    
    
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(node==null){
            return ans;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            
         int s=q.size();
         for(int i=0;i<s;i++){
         Node temp=q.remove();
         if(i==s-1){
             ans.add(temp.data);
         }
         if(temp.left!=null){
             q.add(temp.left);
         }
         
         if(temp.right!=null){
             q.add(temp.right);
         }
         }
        }
        
        return ans;
    }
}

