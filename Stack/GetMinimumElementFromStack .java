class GfG
{
    int min;
    Stack<Integer> s;

    GfG(){
        //min=-1;
        s=new Stack<>();
    }
    /*returns min element from stack*/
    int getMin()
    {
    if(s.isEmpty()){
	        return -1;
	    }    
	return min;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	    if(s.isEmpty()){
	        return -1;
	    }
	    int v=s.pop();
	    if(v>=min){
	        return v;
	    }else{
	        int t=min;
	        min=2*min-v;
	        return t;
	    }
	    
    }

    /*push element x into the stack*/
    void push(int x)
    {
	if(s.isEmpty()){
	   s.push(x);
	   min=x;
	}else{
	  
	  if(x>=min){
	   s.push(x);
	   
	  }else{
	   s.push(x+(x-min));
	   min=x;
	      
	  }  
	}
    }	
}

