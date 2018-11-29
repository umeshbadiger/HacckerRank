package Level1;

public class IndexToarray
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3,0};
		int b[] = new int[4];
		int temp =0;
		
		for(int i=0; i<a.length; i++)
		{
			temp = a[i];
			b[temp]= i;
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}

}
