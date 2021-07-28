// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        int arr[] = new int[26];
        StringBuilder str = new StringBuilder();
        Queue<Character> queue = new LinkedList<Character>();
        
        for(int i = 0;i<A.length();i++) {
            arr[A.charAt(i)-'a']++;
            queue.add(A.charAt(i));
            while(!queue.isEmpty()){
                if(arr[queue.peek()-'a']>1)
                {
                    queue.poll();
                }else{
                    break;
                }
            }
            
            if(queue.isEmpty())
                str.append("#");
            else
                str.append(queue.peek());
                
        }
     return str.toString();   
    }
    }
