class Peak
{
	// Function to find the peak element
	// a[]: input array
	// n: size of array a[]
	public int peakElement(int[] a,int n)
    {
        if(n==1){
            return a[0];
        }
       if(a[0]>a[1]){
           return 0;
       }
       if(a[n-1]>a[n-2]){
           return n-1;
       }
       for(int i=1;i<a.length-1;i++){
           if(a[i]>a[i+1] && a[i]>a[i-1]){
               return i;
           }
       }
       
       return -1;
    }
}
