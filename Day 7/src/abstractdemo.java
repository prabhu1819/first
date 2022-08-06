abstract class shapes
{
	abstract void calculate();
}

public class abstractdemo extends shapes
{
	int a,b,c;
	void accept(int a1,int b1)
	{
		a=a1;
		b=b1;
	}
	void calculate()
	{
		c=a*b;
		System.out.println("Area of rectangle"+c);
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		abstractdemo d = new abstractdemo();
		d.accept(40,50);
		d.calculate();
	}

}
