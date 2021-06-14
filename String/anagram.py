

#User function Template for python3


class Solution:
    
    #Function is to check whether two strings are anagram of each other or not.
    def isAnagram(self,a,b):
        #code here
        aa=list(a)
        bb=list(b)
        dict1={}
        dict2={}
        for x in aa :
            if x in dict1:
                dict1[x]=dict1[x]+1
            else:
                dict1[x]=1
                
        for x in bb :
            if x in dict2:
                dict2[x]=dict2[x]+1
            else:
                dict2[x]=1
                
        if dict1==dict2:
            return 1
        else:
            return 0
        
                

#{ 
#  Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER

@atexit.register

def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

if __name__=='__main__':
    t = int(input())
    for i in range(t):
        a,b=map(str,input().strip().split())
        if(Solution().isAnagram(a,b)):
            print("YES")
        else:
            print("NO") 
# } Driver Code Ends
