class solve{
    public static int evaluatePostFix(String exp){
       
       Stack<Integer> s=new Stack<>();
       for(int i=0;i<exp.length();i++){
           
           char c=exp.charAt(i);
           if(Character.isDigit(c)){
               s.push(c-'0');
           }else{
               int v1=s.pop();
               int v2=s.pop();
               
               if(c=='+'){
                   s.push(v1+v2);
               }
                if(c=='-'){
                   s.push(v2-v1);
               }
               if(c=='*'){
                   s.push(v1*v2);
               }
                if(c=='/'){
                   s.push(v2/v1);
               }
               
               
           }
           
           
           
       }
       return s.pop();
       
    }
    
}
