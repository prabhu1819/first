
class A
{
	void methodA()
	{
		System.out.println("im in class A");
	}
}
class B extends A
{
	void methodB()
	{
		System.out.println("im in class B");
	}
}
public class inheritence 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		B b= new B();
		b.methodA();
		b.methodB();
	}

}
