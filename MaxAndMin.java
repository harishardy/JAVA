import java.util.Scanner;

public class MaxAndMin 
{
	public static long maximum(long a,long b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	
	public static long minimum(long a,long b)
	{
		if(a<b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	public static void main(String[] args) 
	{
		long t=-999999999,y=999999999;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to compare: ");
		
		int length=scan.nextInt();
		
		System.out.println();
		
		long[] elements=new long[100];
		
		for(int i=0;i<length;i++)
		{
			System.out.println("Enter the "+(i+1)+" position number: ");
			
			elements[i]= scan.nextInt();
		}
		
		scan.close();
		
		System.out.println();
		
		for(int i=0;i<length;i++)
		{
			t=maximum(t,elements[i]);
			
		}
		
		System.out.println("The Biggest value of the entered elements is:\n\n"+"   "+t);
		
		System.out.println();
		
		for(int i=0;i<length;i++)
		{
			y=minimum(y,elements[i]);
		}
		
		System.out.println("The Smallest value of the entered elements is:\n\n"+"   "+y);	
		
	}

	
}
