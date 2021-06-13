#User function Template for python3

class Solution:
    def longestPalin(self, S):
        l=""
        x=""
        le=0
        for i in range(0,len(S)):
            for j in range(i+1,len(S)+1):
                l=S[i:j]
                #print(l,len(l))
                if(l==l[::-1] and len(l)>le):
                    x=l
                    le=len(l)  
        return x
        # code here

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        S = input()

        ob = Solution()

        ans = ob.longestPalin(S)

        print(ans)
# } Driver Code Ends

