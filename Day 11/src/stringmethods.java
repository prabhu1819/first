
public class stringmethods 
{
	public static void main(String[] args) 
	{
		StringBuffer s= new StringBuffer("Hello");
		s.append("Jeet");
		System.out.println(s);
		StringBuffer s1= new StringBuffer("Hello");
		s1.insert(1,"l");
		System.out.println(s1);
		StringBuffer s2= new StringBuffer("Hello");
		s2.insert(4, "A");
		System.out.println(s2);
		StringBuffer s3= new StringBuffer("Hello");
		s3.replace(0, 3,"java");
		System.out.println(s3);
		StringBuffer s4 = new StringBuffer("I love Dogs");
		s4.reverse();
		System.out.println(s4);
		StringBuffer s5 = new StringBuffer("IloveDogs");
		s5.delete(1,4);
		System.out.println(s5);
		StringBuffer s6 = new StringBuffer("IloveDogs");
		s6.append("Andiownone");
		System.out.println(s6.length());
		System.out.println(s6.capacity());
		
	}

}
