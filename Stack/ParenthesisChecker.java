class Parenthesis
{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
       Stack <Character> s=new Stack<>();
       if(x.length()==0){
           return true;
       }
       
       for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            if(c=='{' || c=='[' || c=='('){
                s.push(c);
            }
            
            if(c=='}' ||c==']' ||c==')'){
                
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='{' && c=='}'){
                    s.pop();
                }else if(s.peek()=='(' && c==')'){
                    s.pop();
                }else if(s.peek()=='[' && c==']'){
                    s.pop();
                }else{
                    return false;
                }
                
                
            }           
           
           
       }
       
       return s.isEmpty();
    }
}
