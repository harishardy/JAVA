import  java.util.Scanner;

class DisariumNumber
{
public static void main(String a[])
{

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");
    
    System.out.println();

    String num = input.next();
    	
    input.close();
    	
    long t=0;
    	
    
    for(int i =0;i<num.length();i++)
    	{
    		t+=Math.pow(num.charAt(i)-48, i+1);
    	}
    	
    System.out.println();
    	
    String s=Long.toString(t);
    	
    
    if(num.equals(s))
    	{
    		System.out.println("The Number you entered is a DISARIUM number.");
    	}
    	
    else
    	{
    		System.out.println("The Number you entered is NOT A DISARIUM number.");
    	}
    	
	}
}
