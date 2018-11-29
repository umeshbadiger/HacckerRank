package Level1;
import java.util.Scanner;
public class TOdiArray 
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=scn.nextInt();
		int ar[][] = new int[n][n];
		System.out.println("read array elements");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				ar[i][j]= scn.nextInt();
				
			}
	}
		
//		while(j!=2+1)
//		{
//			 
//			for(int i=2;i>=0;i--)
//			{
//				System.out.print(ar[i][j]);
//			}
//			j++;
//			System.out.println();
//		}
		
			
//		for(int i=0; i<n; i++)
//		{
//			for(int j=n-1; j>=0; j--)
//			{
//				System.out.print(ar[j][i]+" ");
//			}
//			System.out.println();
//		}
//		
		for(int i=0; i<n; i++)
		{
			for(int j=2; j>=0; j--)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
//		for(int i=0; i<n; i++)
//		{
//			for(int j=0; j<n; j++)
//			{
//				System.out.print(ar[i][j]+" ");
//			}
//			System.out.println();
//		}
	}
}
 