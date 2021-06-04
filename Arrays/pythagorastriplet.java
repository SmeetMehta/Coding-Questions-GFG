// { Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here

        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i:arr){
            a.add(i);
        }
        
        Collections.sort(a);
        
        for(int i=n-1;i>=2;i--)
        {
            int min=0,max=i-1;
            
            while(min<max){
                int x=a.get(min)*a.get(min);
                int y=a.get(max)*a.get(max);
                int z=a.get(i)*a.get(i);
                
                if(x+y==z)
                 return true;
                 
                if(x+y>z)
                  max--;
                else
                  min++;
            }
        }
            
        return false;
            
    }
}
        
    
