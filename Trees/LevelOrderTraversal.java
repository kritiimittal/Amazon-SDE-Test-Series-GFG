class Level_order_traversal
{
    //You are required to complete this method
    static ArrayList <Integer> levelOrder(Node node) 
    {
       Queue<Node> q=new LinkedList<>();
       q.add(node);
       ArrayList <Integer> ans=new ArrayList <Integer>();
       
       while(!q.isEmpty()){
           
           Node temp=q.remove();
           ans.add(temp.data);
           if(temp.left!=null){
               q.add(temp.left);
               
           }
           if(temp.right!=null){
               q.add(temp.right);
               
           }
           
       }
       
       return ans;
    }
}

