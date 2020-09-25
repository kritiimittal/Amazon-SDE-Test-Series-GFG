class MyStack {

    // Note that top is by default null
    // in Java
    StackNode top;

    void push(int a) {
        StackNode s=new StackNode(a);
        if(top==null){
            top=s;
        }else{
            s.next=top;
            top=s;
        }
        
    }
    int pop() {
        if(top==null){
            return -1;
        }
        int v=top.data;
        top=top.next;
        return v;
        
    }
}
