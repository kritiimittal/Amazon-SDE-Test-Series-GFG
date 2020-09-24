class Tree
{
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> ans=new ArrayList<Integer>();
      if(root==null){
          return ans;
      }
      
      Queue<Node> q=new LinkedList<>();
      q.add(root);
      
      while(!q.isEmpty()){
         
        int s=q.size();
        for(int i=0;i<s;i++){
         Node temp=q.remove(); 
         if(i==0){
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
