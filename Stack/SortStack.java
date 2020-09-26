class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> t=new Stack<Integer>();
		
		while(!s.isEmpty()){
		    
		    int v=s.pop();
		    while(!t.isEmpty() && t.peek()>v){
		        s.push(t.pop());
		    }
		    
		    t.push(v);
		}
		return t;
	}
}
