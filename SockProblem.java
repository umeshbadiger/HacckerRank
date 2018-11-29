package Level1;

import java.util.Arrays;

public class SockProblem
{
	public static void main(String[] args) 
	{
		int ar[] = {65,65,65,65,65,65,65,65,85,85,85,76};
		int res = 0;
		int temp = 0;
		int n = ar.length;
	//	System.out.println(n);
		int count=0;

		Arrays.sort(ar);
		
		
		for(int i=0 ; i<n-1; i++)
		{
			count=1;
			int j=0;
			for( j = i+1 ; j < n ; j++)
			{
				if(ar[i]==ar[j])
				{
					count=count+1;
				}
				else 
				{	
					i=j-1;
					break;
				}	
				if(j==11)
				{
					i=j;
				}
			}
			
			count = count/2;
			res =res+count;
		}
		System.out.println("the total no of pairs are: "+res);
	}

}
 