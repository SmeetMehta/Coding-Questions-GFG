// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        int size=S.length();
        String x="";
        Stack<String> st=new Stack<String>();
        for(int i=0;i<size;i++)
        {
            if(S.charAt(i)!='.'){
                x=x+S.charAt(i); 
            }
            else
            {
                st.push(x);
                st.push(".");
                x="";
                continue;
            }
            if(i==size-1)
                st.push(x);          
        }
        
        String y="";
        for(int i=st.size()-1;i>=0;i--)
         y=y+st.pop();
        
        return y;
        
    }
}
