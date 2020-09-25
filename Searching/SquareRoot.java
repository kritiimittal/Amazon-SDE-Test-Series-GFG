class SquareRoot
{
     long floorSqrt(long x)
	 {
	    long i=1;
	    while(i*i<=x){
	        
	        i++;
	    }
	    
	    return i-1;
	 }
}
