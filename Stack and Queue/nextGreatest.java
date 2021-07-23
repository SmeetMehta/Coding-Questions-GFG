// { Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code herevector<long long> ans(n,-1);
        Stack<Integer> s=new Stack<Integer>(); //The stack is used here to store the index of the elements untill the next greatest element is encountered.
        long[] ans=new long[n];
        Arrays.fill(ans,-1);   // filled the array ans with -1. if we do not have any greater element on right side
        s.push(0);  //pushed the 1st position
        for(int i=1;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()] < arr[i]){ // the while loop runs until the next greated element is found
                ans[s.peek()] = arr[i];
                s.pop();    //once found, it will pop the index from the stack and fill all the those with the greatest element on the right.
            }
            s.push(i);
        }
        return ans;
    } 
}
