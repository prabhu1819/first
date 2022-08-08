
public class multiplecatch 
{
	public static void main(String[] args) 
	{
		try 
	{
		int a[]=new int[5];
		a[7]=22;
	}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
		try 
		{
		 String s = null;
		 int l=s.length();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
