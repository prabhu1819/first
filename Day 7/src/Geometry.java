class circle implements shape
{
	public void cal() 
	{
		System.out.println("Radius of circle is:"+result);
	}
	float b, result;
	void acc( int r)
	{
		b=r;
		result=(b/2);
	}
	@Override
	public void side() 
	{
		System.out.println("The circle has no sides:");
	}
}
class square implements shape
{
	@Override
	public void cal() 
	{
		System.out.println("Area of square is:"+result);
	}
	int a1, b1, c1,result;
	void acc1(int a, int b) 
	{
		a1=a;
		b1=b;
		result=(a*b);
	}
	public void side()
	{
		System.out.println("The number of sides a square has is:"+4);
	}	
}
class triangle implements shape
{

	@Override
	public void side() 
	{
		// TODO Auto-generated method stub
		System.out.println("The number of sides a triangle has:"+3);
	}

	@Override
	public void cal() 
	{
		System.out.println("The Area of a triangle is"+result);
	}
	float b,h,result;
	void acc2(float b1, float h1)
	{
		b=b1;
		h=h1;
		result = (b*h*1/2);
	}
	
}
public class Geometry 
{
	public static void main(String[] args) 
	{
		circle c = new circle();
		c.acc(4);
		c.cal();
		c.side();
		square s= new square();
		s.acc1(5,4);
		s.cal();
		s.side();
		triangle t = new triangle();
		t.acc2(4.5f, 5.3f);
		t.cal();
		t.side();
	}
}
