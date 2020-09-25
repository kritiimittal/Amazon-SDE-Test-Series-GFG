class GfG
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[],
    int m, int n)
    {
        
    Arrays.sort(arr2);    
    ArrayList<Integer> ans=new ArrayList<Integer>();
    
    for(int i=0;i<arr1.length;i++){
        
        int c=0;
        int v=arr1[i];
        for(int j=0;j<n && v >=arr2[j];j++){
            
            c++;
        }
        ans.add(c);
    }
    
    return ans;
    }
}
