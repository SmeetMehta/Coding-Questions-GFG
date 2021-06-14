// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}// } Driver Code Ends

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
        // Your code here
        char[] aa=a.toCharArray();
        char[] bb=b.toCharArray();
        for (char x : aa){
            if(map.containsKey(x))
                map.put(x,map.get(x)+1);
            else
              map.put(x,1);
        }
        
        for (char x : bb){
            if(map1.containsKey(x))
                map1.put(x,map1.get(x)+1);
            else
              map1.put(x,1);
        }

        if(map.equals(map1))
        return true;
        else
        return false;
    }
}
