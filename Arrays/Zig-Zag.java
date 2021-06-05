// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().zigZag(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution {
    void zigZag(int arr[], int n) {
        
        ArrayList<Integer> arr1=new ArrayList<Integer>();//coverted into arraylist to use the swap function so that the space complecxity is matched
        for(int i=0;i<n;i++)
        arr1.add(arr[i]);
        
        
        for (int i =0;i<n-1;i++){
            if(i%2==0){
                if(arr1.get(i)>arr1.get(i+1)){
                    Collections.swap(arr1,i,i+1);
                }
            }
            else{
                if(arr1.get(i)<arr1.get(i+1)){
                    Collections.swap(arr1,i,i+1);
            }
            }
        }
        for(int i=0;i<n;i++)
        arr[i]=arr1.get(i);
        // code here
    }

}
