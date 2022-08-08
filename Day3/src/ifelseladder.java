
public class ifelseladder {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int marks=80;
		if(marks<35)
		{
			System.out.println("Student is fail");
		}
		else if((marks>35) && (marks<50))
		{
			System.out.println("Class C");
		}
		else if((marks>50) && (marks<75))
		{
			System.out.println("Class B");
		}
		else if((marks>75) && (marks<90))
		{
			System.out.println("Class A");
		}
		else
		{
			System.out.println("invalid Data");
		}
	}

}
