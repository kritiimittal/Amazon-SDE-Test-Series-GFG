class GfG
{
    int thirdLargest(int a[], int n)
    {
       int max=-1;
       int sm=-1;
       for(int i=0;i<a.length;i++){
           if(a[i]>max){
               sm=max;
               max=a[i];
           }
           
           if(a[i]>sm && a[i]<max){
               sm=a[i];
           }
       }
       
       int tm=-1;
       for(int i=0;i<a.length;i++){
           if(a[i]!=max && a[i]!=sm){
                
                tm=Math.max(tm,a[i]);
           }
       }
	    
	    return tm;
    }
}
