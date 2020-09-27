class Sol
{
    // return the first non-repeating char in S.
    // if there's no non-repeating char, return "-1"
    public static String find(String s)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        
        
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int v=map.get(s.charAt(i))+1;
                map.put(s.charAt(i),v);
            }else{
                map.put(s.charAt(i),1);
            }
        }
    
    
    for(int i=0;i<s.length();i++){
            
        if(map.get(s.charAt(i))==1){
            return s.charAt(i)+"";    
        }
    }
    
    return "-1";
    }  
}
