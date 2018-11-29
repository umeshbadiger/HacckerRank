package Level1;

import java.util.Scanner;

public class ArrayPbl2
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();		
		int arr[][] = new int[4][4];
		int abb[][]= {{2,3,4,2},{3,4,5,6},{8,7,2,5},{6,7,3,2}};
	//	System.out.println(abb.length);
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(abb[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("##################");
		
		for(int i=0; i<n; i++)
		{
			int k=0;
			for(int j=n-1; j>=0; j--)
			{
				
			arr[i][k]=abb[j][i];
			k++;
			}
			System.out.println();
		}
		int a=1;
		for(int x=2; x>=1; x--)
		{
			 int b=1;
			for(int y=2; y>=1; y--)
			{
				abb[a][b] = arr[x][y];
				b++;
			}
			a++;
			System.out.println();
		}
		int c=1;
		for(int i=1; i<3; i++)
		{
			int d=1;
			for(int j=1; j<3; j++)
			{
				abb[i][j] = arr[c][d];
				d++;
			}
			c++;
			System.out.println();
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	
	}
}
