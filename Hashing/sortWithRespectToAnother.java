// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


 // } Driver Code Ends
//User function Template for Java

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
public static int[] sortA1ByA2(int arr1[], int n, int arr2[], int m)
    {
       TreeMap<Integer,Integer> map=new TreeMap<>();
        int i=0;
        
        for( int j=0;j<n;j++)
        if(!map.containsKey(arr1[j]))
            map.put(arr1[j],1);
        else
            map.put(arr1[j],map.get(arr1[j])+1);
        
        for( int j=0;j<m;j++)
        {
         
            if(map.containsKey(arr2[j]))
            { 
               for( int k=0;k<map.get(arr2[j]);k++)
                arr1[i++]=(arr2[j]);
                map.remove(arr2[j]);
            }
        }
        
            for(Entry<Integer,Integer> msi : map.entrySet())
        {
            for(int p=0;p<msi.getValue();p++)
            arr1[i++]=msi.getKey();
        }
        
        
        return arr1;
    
     
    }
}
// { Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}


  // } Driver Code Ends
