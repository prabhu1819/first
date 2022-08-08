
public class Relationaloperators {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10 ,b=20, c=30;
		System.out.println("Result="+(a==b));
		System.out.println("Result="+(a>=b));
		System.out.println("Result="+((a!=b) && (a<b)));// Not , and operator
		System.out.println("OR Operator="+(!(a>b)||(b>c)));
		System.out.println("AND Operator="+((b==c)&&(c>a)||(a<b)));
		String str=(b>c) || (c>a) ? "True" : "False"; //Ternary Operator
		System.out.println(str);
		
		}

}
  