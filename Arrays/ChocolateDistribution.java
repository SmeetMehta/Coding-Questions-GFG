// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<Long>();
            for(int i = 0;i<n;i++)
                {
                    long x = sc.nextInt();
                    arr.add(x);
                }
            long m = sc.nextLong();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
         Long mini=Long.MAX_VALUE;;
         int nn=(int)n;
         int mm=(int)m;
        Collections.sort(a);
        for(int i=nn-1;i-mm+1>=0;i--){
            Long max=a.get(i);
           // System.out.println(max);
            Long min=a.get(i-mm+1);
            //System.out.println(min);
            
            //System.out.println();
        
            if(max-min<mini)
            mini=max-min;
        }
      return mini;
        
    }
    
}
