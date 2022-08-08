class S
{
	final int a=10;
	int b;
	void sum()
	{
		b=a+10;
	}
}
class D extends S
{
	void disp()
	{
		System.out.println("The number before sum"+super.a);
		System.out.println("The sum is "+b);
	}
}
public class selfexample
{
	public static void main(String[] args) 
	{
		D f= new D();
		f.sum();
		f.disp();
	}

}
