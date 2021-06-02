#User function Template for python3

class Solution:
    # Complete this function
    
    #Function to find equilibrium point in the array.
    def equilibriumPoint(self,A, N):
        # Your code here
        if(N==1):
            return(1)
        else:
            res=-1
            sum=0
            B=[]
            for i in range(0,N):
                sum=sum+A[i]
                B.append(sum)
            
            for i in range (0,N-1):
                if(B[i]==(B[N-1]-B[i+1])):
                    res=i+2
            #print(list(B))
            return(res)

#{ 
#  Driver Code Starts
# Initial Template for Python 3

import math


def main():

    T = int(input())

    while(T > 0):

        N = int(input())

        A = [int(x) for x in input().strip().split()]
        ob=Solution()

        print(ob.equilibriumPoint(A, N))

        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends
