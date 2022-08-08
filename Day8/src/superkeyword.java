class Birds
{
	final String color="green"; 
}
class Budgies extends Birds
{
	String color="yellow";
	void col()
	{
		System.out.println("The color of the bird is "+super.color);
		System.out.println("The color of the Budgie is "+color);
	}
}
public class superkeyword 
{
	public static void main(String[] args) 
	{
		Budgies B = new Budgies();
		B.col();
		
	}

}
