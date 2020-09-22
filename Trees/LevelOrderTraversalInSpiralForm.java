class Spiral
{
      ArrayList<Integer> findSpiral(Node root) 
      {
          
        if(root==null){
            return new ArrayList<>();
        }  
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        boolean rtol=true;
        s1.push(root);
        
        while(!s1.isEmpty())  {
            
        Node temp=s1.pop();
        ans.add(temp.data);
        
        if(rtol){
            if(temp.right!=null){
                s2.push(temp.right);
            }    
        
            if(temp.left!=null){
                s2.push(temp.left);
            }    
            
        }else{
            if(temp.left!=null){
                s2.push(temp.left);
            }     
            if(temp.right!=null){
                s2.push(temp.right);
            }    
        }    
        
        if(s1.isEmpty()){
            rtol=!rtol;
            Stack<Node> w=s1;
            s1=s2;
            s2=w;
        }
        } 
        
        return ans;
      }
}
