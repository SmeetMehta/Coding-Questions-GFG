// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        String res=""+S.charAt(0);
        for(int i=1;i<S.length();i++)
        {
            if(!res.contains(S.substring(i,i+1)))
            res=res+S.charAt(i);
            
        }
        return res;
    }
}
