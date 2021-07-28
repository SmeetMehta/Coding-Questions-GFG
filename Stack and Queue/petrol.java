// { Driver Code Starts
import java.util.*;


class First_Circular_tour
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			String arr[] = str.split(" ");
			int p[] = new int[n];
			int d[] = new int[n];
			int j=0;
			int k=0;
			for(int i=0; i<2*n; i++)
			{
				if(i%2 == 0)
				{
					p[j]= Integer.parseInt(arr[i]);
					j++;
				}
				else
				{
					d[k] = Integer.parseInt(arr[i]);
					k++;
				}
			}
			
			System.out.println(new Solution().tour(p,d));
		t--;
		}
	}
}// } Driver Code Ends


// In java function tour() takes two arguments array of petrol
// and array of distance

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    
    int tour(int petrol[], int distance[])
    {
	// Your code here	
	    int tam = petrol.length;
        int sum = 0;
        int acumSum = 0;
        int cost[] = new int[tam];

        for(int i = 0; i < tam; i ++){
            cost[i] = petrol[i] - distance[i];
        }

        sum = 0;
        int j = 0;
        for(int i = 0; i < tam; i++){
            sum += cost[i];
            if(sum < 0){
                j=i+1;
                acumSum += sum;
                sum = 0;
            }
        }
    return sum + acumSum >= 0 ? j : -1;

    }
}
