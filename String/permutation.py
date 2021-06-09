#User function Template for python3
from itertools import permutations

class Solution:
    def find_permutation(self, S):
        
        res=[]
        res=permutations(S)
        y=[]
        for p in res:
            y.append(''.join(p))
             
        y.sort()
        return y
#{ 
#  Driver Code Starts
#Initial Template for Python 3


if __name__ == '__main__':
	t=int(input())
	for i in range(t):
		S=input()
		ob = Solution()
		ans = ob.find_permutation(S)
		for i in ans:
			print(i,end=" ")
		print()
# } Driver Code Ends
