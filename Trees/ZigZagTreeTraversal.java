class GFG
{
    // return an array containing the zig zag level order traversal of the given tree
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	   boolean ltor=true;
	   Stack<Node> s1=new Stack<>();
	   Stack<Node> s2=new Stack<>();
	   ArrayList<Integer> a=new ArrayList<>();
	   s1.push(root);
	   while(!s1.isEmpty()){
	       
	       Node t=s1.pop();
	       a.add(t.data);
	       if(ltor){
	           if(t.left!=null){
	               s2.push(t.left);
	           }
	           if(t.right!=null){
	               s2.push(t.right);
	           }
	           
	       }else{
	           if(t.right!=null){
	               s2.push(t.right);
	           }
	           if(t.left!=null){
	               s2.push(t.left);
	           }
	       }
	       
	       if(s1.isEmpty()){
	       ltor=!ltor;
	       Stack<Node> temp=s1;
	       s1=s2;
	       s2=temp;
	           
	       }
	   }
	   
	  return a; 
	   
	}
}
