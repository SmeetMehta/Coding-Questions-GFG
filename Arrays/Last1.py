#User function Template for python3

class Solution:
    def lastIndex(self, s):
        # code here
        index=-1
        for i in range(len(s)-1,-1,-1):
            if(s[i]=='1'):
                index=i
                break
                
        return index
        
        


#{ 
#  Driver Code Starts
#Initial Template for Python 3


def main():

    T = int(input())

    while(T > 0):
    	s = input()
    	ob = Solution()
    	print(ob.lastIndex(s))
    	
    	T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends
