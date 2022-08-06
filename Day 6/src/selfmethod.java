class D1
{
	void operation(int a, int b)
	{
		System.out.println("The addition of two numbers="+(a+b));
	}
	void operation(int a, float b)
	{
		System.out.println("The Substraction of two numbers="+(a-b));
	}
	void operation(float a, double b)
	{
		System.out.println("The Multiplication of two numbers="+(a*b));
	}
}
class B extends D1
{
	void operation(int a, int b)
	{
		System.out.println("The result is"+(a+b));
	}
	void per(float a,float b)
	{
		System.out.println("The percentage is"+((a/b)*100));
	}
}
public class selfmethod
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		D1 d = new D1();
		B b = new B();
		b.per(550, 750);
		d.operation(5, 5);
		d.operation(5.0f, 5.0);
		d.operation(5, 5.5f);
		
		

	}

}
