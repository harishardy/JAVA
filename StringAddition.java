import java.util.Scanner;

public class StringAddition 
{
	
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter your first number: ");
	
		String s1=scan.next();
	
		System.out.println("Enter your second number: ");
	
		String s2=scan.next();
		
		String[] result = new String[10];
		
		long t=0;
		
		long carry=0;
		
		String x="";
		
		String y="0";
		
		String z="";
		
		long count=0;
		
		int w=0;
		
		long r=0;
		
		String n="0";
		
		scan.close();
		
		if(s1.length()>s2.length()) 
		{
			count=s1.length()-s2.length();
			
			for(int i=0;i<count;i++)
			{
				x+=y;
			}
			
			z=x+s2;
			
			for(int i =0;i<s1.length();i++)
		  		
			{
	  			t=((s1.charAt(s1.length()-1-i)-48))+((z.charAt(z.length()-1-i)-48))+carry;
	  			
	  			r=t%10;
	  			
	  			String s=Long.toString(r);
	  			
	  			result[i]=s;

	  			carry = t/10;
	  			
	  		}
			
			n=Long.toString(carry);
			
			result[s1.length()]=n;
			
			System.out.print( "Sum of the number is: ");
			
			if (carry!=0)
			{
			System.out.print(carry);
			}
			
			for(w=s1.length()-1;w>=0;w--)
			{
				System.out.print(result[w]);
			}
			
			
			
		}
		else if(s2.length()>s1.length()) 
		{
			count=s2.length()-s1.length();
			
			for(int i=0;i<count;i++)
			{
				x+=y;
			}
			
			z=x+s1;
			
			for(int i =0;i<s2.length();i++)
		  		
			{
	  			t=((z.charAt(z.length()-1-i)-48))+((s2.charAt(s2.length()-1-i)-48))+carry;

	  			r=t%10;
	  			
	  			String s=Long.toString(r);
	  			
	  			result[i]=s;

	  			carry = t/10;

	  		}
			
			n=Long.toString(carry);
			
			result[s2.length()]=n;
			
			System.out.print( "Sum of the number is: ");
			
			if(carry!=0)
			{
			System.out.print(carry);
			}
			
			for(w=s2.length()-1;w>=0;w--)
			{
				System.out.print(result[w]);
			}
			
			
		}
		else if(s1.length()==s2.length())
		{

			for(int i =0;i<s1.length();i++)
  		
			{
				t=((s1.charAt(s1.length()-1-i)-48))+((s2.charAt(s2.length()-1-i)-48))+carry;
  			
				r=t%10;
	  			
	  			String s=Long.toString(r);
	  			
	  			result[i]=s;

	  			carry = t/10;
			}
			
			n=Long.toString(carry);
			
			result[s1.length()]=n;
			
			System.out.print( "Sum of the number is: ");
			
			if(carry!=0)
			{
				System.out.print(carry);
			}
			
			for(w=s1.length()-1;w>=0;w--)
			{
				System.out.print(result[w]);
			}
		
			
		}
      
	}
}

