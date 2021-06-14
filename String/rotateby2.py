#User function Template for python3



#Function to check if a string can be obtained by rotating
#another string by exactly 2 places.
class Solution():
    def isRotated(self,str1,str2):
    #code here
        x=str1[0:2]
        y=str1[len(str1)-2:len(str1)]
        
        x=str1[2:len(str1)]+x
        y=y+str1[0:len(str1)-2]
        
        if(len(str1)==1 and str1==str2):
            return 1
        elif(len(str1)==1 and str1 != str2):
            return 0
        elif(str2==x or str2==y):
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
        s=str(input())
        p=str(input())
        if(Solution().isRotated(s,p)):
            print(1)
        else:
            print(0)
# } Driver Code Ends
