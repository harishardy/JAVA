import java.util.Scanner;

public class StringOperation
{
	
	
	public static int size(String s)
	{
		int i=0;
		
		try
		{
			for(i=0;;i++)
			{
				s.charAt(i);
			}
		}
		
		catch (Exception e)
		{
			
		}
		
		return i;
	}
	
	
	public static String backwards(String s)
	{
		String w="";
		
		for(int i=size(s);i>0;i--)
		{
			w+=s.charAt(i-1);
		}
		return w;
	}
	
	
	public static String palindrome(String s)
	{
		String w="Is";
		
		String u="Is not";
		
		if(s.equals(backwards(s)))
		{
			return w;
		}
		else
		{
			return u;
		}
	}
	
	public static String compare(String s,String n)
	{
		String w="Are";
		
		String u="Are not";
		
		if(s.equals(n))
		{
			return w;
		}
		else
		{
			return u;
		}
	}
	
	
	public static void count(String s)
	{
		int times=0;
		
		for(int i=0;i<size(s);i++)
		{
			for(int l=0;l<=size(s)-1;l++)
			{
				if(s.charAt(i)==(s.charAt(l)))
				{
					times++;
				}
			
			}
			System.out.println("The character "+s.charAt(i)+" occured "+(times)+" times\n ");
			times=0;
		}
	}
	
  
	public static void main(String[] args) 
	{
		String s1;
		
		String s2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first String: \n");
		
		s1 = scan.next();
		
		System.out.println("\nEnter the Second String: \n");
		
		s2 = scan.next();
		
		scan.close();
		
		System.out.println("\n\nThe length of the First String is : \n");
		
		System.out.println(size(s1));
		
		System.out.println("\nThe length of the Second String is : \n");
		
		System.out.println(size(s2));
		
		System.out.println("\n\nThe reverse order of the First String is : \n");
		
		System.out.println(backwards(s1));
		
		System.out.println("\nThe reverse order of the Second String is : \n");
		
		System.out.println(backwards(s2));
		
		System.out.println("\n\nThe First and Second String : \n\n"+compare(s1,s2)+" COMPARITIVELY EQUAL");
		
		System.out.println("\n\nThe First String : \n\n"+palindrome(s1)+" a PALINDROM");
		
		System.out.println("\nThe Second String : \n\n"+palindrome(s2)+" a PALINDROM");
		
		System.out.println("\n\nThe First character of the First String is : \n\n"+s1.toUpperCase().charAt(0));
		
		System.out.println("\nThe First character of the Second String is : \n\n"+s2.toUpperCase().charAt(0));
		
		System.out.println("\n\nIn the First String: \n\n");
		
		count(s1);
		
		System.out.println("\n\nIn the Second String: \n\n");
		
		count(s2);
	}
}




























