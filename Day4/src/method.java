
public class method 
{
	String name;
	int roll_no;
	float a,b,result1;
	void details(String a, int b)
	{
		name=a;
		roll_no=b;
	}
	void per(float a1, float b1)
	{
		a=a1;
		b=b1;
		result1=((a1/b1)*100);
	}
	void display()
	{
		System.out.println("The details of the student is="+name);
		System.out.println("roll_no="+roll_no);
	}
	void disp()
	{
		System.out.println("Percentage obtained="+result1);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		method m = new method();
		m.details("jeet", 501);
		m.display();
		m.per(455, 750);
		m.disp();
		
		m.details("nikita", 502);
		m.display();
		m.per(523, 750);
		m.disp();
		
		m.details("Yogita", 503);
		m.display();
		m.per(625, 750);
		m.disp();
	}

}
