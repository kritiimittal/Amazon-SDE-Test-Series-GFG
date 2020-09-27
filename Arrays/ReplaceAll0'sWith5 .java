class GfG {
    int convertfive(int num) {
        
        if(num<=9){
            return num;
        }
        
        int v=num%10;
        if(v==0){
            v=5;
        }
        
        int small= convertfive(num/10);
        return small*10+v;
    }
}
