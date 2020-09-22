class Level_Order_Traverse
{
    static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        
        q.add(node);
        while(!q.isEmpty()){
            int sz=q.size();
            ArrayList<Integer> small=new ArrayList<Integer>();
            for(int i=0;i<sz;i++){
                Node temp=q.remove();
                small.add(temp.data);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                
            }
            
            ans.add(small);
            
        }
        
        return ans;
    }
}
