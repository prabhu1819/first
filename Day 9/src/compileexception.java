import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class compileexception 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String name=b.readLine();
		System.out.println("name is "+name);
		
	}

}
