package Level1;

public class Program1 
{
	public static void main(String[] args) 
	{
		int ar[] = {1,1,5,5,7,3,4,3,3,3,4};
		int res=0;
		int n = ar.length; int temp;
		
//		for(int i =1; i<n; i++)
//		{
//			for(int j = 0 ; j<n-i; j++)
//			{
//				if(ar[j]>ar[j+1])
//				{
//					temp = ar[j];
//					ar[j] = ar[j+1];
//					ar[j+1]= temp;
//				}//
//			}
//		}
		
		temp=0;
		
		for(int i=0; i<ar.length; i++)
		{
			int count = 1;
			for(int j=0; j<ar.length; j++)
			{
				if(ar[i]==ar[j] && i!=j)
				{
					count++;
					temp= ar[j];
					ar[j] = ar[ar.length-1];
					ar[ar.length-1]=  temp;
					j--;
					n--;
				}
			}
	//		System.out.println(ar[i]);
			
			count =count/2;
			res = res+count;
		}
		
		System.out.println(res);
	}

}
