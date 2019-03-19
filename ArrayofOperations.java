import java.util.Scanner;
public class ArrayofOperations
{

	
	public static void main(String[]args)
	{
		
		int d,q=0,i,p=0,n=0;
		String t1,temp = null;
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[9999];
		
		System.out.println("Enter the numbers:\n");
		t1= scan.next();
		
		
		mainloop:for(i=0;;)
		{
			
			if(t1.equals("000"))
			{
				break mainloop;	
			}
			else
			{
				
				sizeloop:for(i=0;i<t1.length();i++)
				{
					charcheckloop:for(char j='0';j<='9';j++)
					{
						if(t1.charAt(i)==j)
						{
							temp="y";
							break charcheckloop;
						}
					
						else
						{
							temp="n";
							continue charcheckloop;
						}
					
					}
				
					if(temp=="y")
					{
						continue sizeloop;
					}
					else
					{
						break sizeloop;
					}
				
				
				}
					
				
			
				if(temp=="y")
				{
					if(t1.length()<=10)
					{
						long l1=Long.parseLong(t1);
						
						if(l1<=2147483647)
						{
								t1=String.valueOf(l1);
								Integer i1=Integer.parseInt(t1);
								arr[q]=i1;
								q++;
						}
						else
						{
							System.out.println("\nEnter integer compatible value\n");
							t1= scan.next();
							continue mainloop;
						}
						
					}
					else
					{
						System.out.println("\nEnter integer compatible value\n");
						t1= scan.next();
						continue mainloop;
					}
				}
				else
				{
					System.out.println("\nEnter only numbers\n");
					t1= scan.next();
					continue mainloop;
				}
				
			}
			System.out.println();
			t1= scan.next();
			continue mainloop;
		}
		
		
		

		n=q;
		

		
		System.out.println("\nEntered elements are:\n ");
		for(i=0;i<n;i++)
		{
			System.out.println((i+1)+". "+arr[i]+"\n");
		}
		
		
		
		
		System.out.println("\nEnter element to delete: \n");
		d=scan.nextInt();
		
		for(i=0;;)
		{
		
			for(i=0;i<q;i++)
			{
				if(arr[i]==d)
				{
					p=i+1;
				}
			
			}
		
		
			if(p!=0)
			{
				for(i=(p-1);i<q;i++)
				{
					arr[i]=arr[i+1];
				}
			
				System.out.println("\nElements after deletion:\n ");
			
				for(i=0;i<(q-1);i++)
				{
					System.out.println((i+1)+". "+arr[i]+"\n");
				}
				break;
			}
		
			else
			{	
				System.out.println("\nEnter a valid number to delete:\n");
				d=scan.nextInt();
				i++;
			
			}
		
		}
		
		scan.close();

	}
}
