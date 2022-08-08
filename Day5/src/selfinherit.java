class AA
{
	static int a = 20;
	static void disp()
	{
		a=a+10;
		System.out.println(a);
	}
	
}
class BB extends AA
{
	String s="SVPM";
	void dip()
	{
		System.out.println("The colledge is="+s);
	}
}
public class selfinherit
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BB b= new BB();
		b.dip();
		b.dip();
		b.disp();b.dip();
		b.disp();
		
		
		
		

	}

}
