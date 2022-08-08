
public class staticd 
{
	static int count=0;
	static void StaticDemo()
	{
		count=count+15;
		System.out.println("count is "+count);
	}
	
	public static void main(String args[]) 
	{
		StaticDemo();
		StaticDemo();
		StaticDemo();
		StaticDemo();
	}
}
