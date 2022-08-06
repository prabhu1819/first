

public class overloadingmam 
{
	void sum(int a)
	{
		System.out.println(a+a);
	}
	void sum(int b, double c)
	{
		System.out.println(b*c);
		
	}
	void sum(double d , int e)
	{
		System.out.println(d-e);
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		overloadingmam m = new overloadingmam();
		m.sum(10);
		m.sum(4, 10.5);
		m.sum(5.5, 3);
	}

}
