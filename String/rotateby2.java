// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}// } Driver Code Ends

class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str1.length()==1 && str1.compareTo(str2)==0)
        {
            return true;
        }
        else if(str1.length()==1)
        {
            return false;
        }
        else{
        String a=str1.substring(2,str1.length())+str1.charAt(0)+str1.charAt(1);
        String b=str1.charAt(str1.length()-1)+str1.substring(0,str1.length()-2);
        String c=str1.charAt(str1.length()-2)+b;
        
        if(str2.compareTo(a)==0 || str2.compareTo(c)==0)
        return true;
        else
        return false;
        }
    }
    
}
