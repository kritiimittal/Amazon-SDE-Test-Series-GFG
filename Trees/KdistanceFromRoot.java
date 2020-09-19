class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Kdistance(root,k,ans);
        return ans;
     }
     
     void  Kdistance(Node root, int k,ArrayList<Integer> ans){
         
        if(root==null){
            return;
        } 
        if(k==0){
            ans.add(root.data);
            return;
        }
         
        Kdistance(root.left, k-1, ans); 
        Kdistance(root.right, k-1, ans); 
        
     }
}
