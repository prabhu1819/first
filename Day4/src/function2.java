
public class function2
{
	double a,b,result;
	int a1,b1,result1;
	void add(int a2,int b2)
	{
		a1=a2;
		b1=b2;
		result1=(a1+b2);
		
	}
	void sub(int a2, int b2)
	{
		a1=a2;
		b1=b2;
		result1=(a1-b2);
		
	}
	void mul(int a2, int b2)
	{
		a1=a2;
		b1=b2;
		result1=(a1*b2);
		
	}
	void div(double a2, double b2)
	{
		a=a2;
		b=b2;
		result=(a/b);
	}
	
	void dis1() 
	{
		System.out.println("Result of two numbers="+result1);
	}
	void disp() 
	{
		System.out.println("division of two numbers="+result);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		function2 f= new function2();
		f.add(10, 20);
		f.dis1();
		f.sub(50,10);
		f.dis1();
		f.mul(5, 5);
		f.dis1();
		f.div(25, 3);
		f.disp();
	}

}
