class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
        if(q1.size()==0){
            return -1;
        }
	    while(q1.size()!=1){
	        q2.add(q1.remove());
	    }
	    int v=q1.remove();
	   Queue<Integer> t=q1;
	   q1=q2;
	   q2=t;
	   return v;
	    
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    q1.add(a);
    }
}

