// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        ArrayList <Integer> arrl=new ArrayList <Integer>();
        ArrayList <Integer> depl=new ArrayList <Integer>();
        
        for(int i=0;i<n;i++){
            arrl.add(arr[i]);
            depl.add(dep[i]);
        }
        
        Collections.sort(depl);
        Collections.sort(arrl);
        /*
        for(int j:depl)
        System.out.println(j);*/
        
        int j=0;
        int pt=1;
        
        for (int i=1;i<n;i++){
            if(arrl.get(i)<=depl.get(j))
            pt++;
            else
            j++;
        }
        
        return pt;
    }
   
}

