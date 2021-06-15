#User function Template for python3
class Solution:
	def removeDups(self, S):
		# code here
	   
        s=list (S)
        res=""+s[0]
        
	    for i in range (1,len(S)):
	        if not S[i:i+1] in res:
	            res=res+(s[i])
	   
	    return res
	    

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		s = input()
		
		ob = Solution()	
		answer = ob.removeDups(s)
		
		print(answer)


# } Driver Code Ends
