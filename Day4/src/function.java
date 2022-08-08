
public class function 
{
	String name;
	int marks, marks_obtained,marks_outoff;
	int roll_no;
	void accept(String n,int r,int m)
	{
		name=n;
		roll_no=r;
		marks=m;
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Roll_no="+roll_no);
		System.out.println("Marks="+marks);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		function f = new function();
		f.name="Jeet";
		f.roll_no=501;
		f.marks=65;
		f.display();
		f.accept("Nikita", 502,68);
		
		f.display();
		f.accept("Yogita", 503,70);
		f.display();
		f.accept("Damini", 504,75);
		f.display();
		f.accept("Om", 505,80);
		f.display();
		f.accept("Rutika", 506,90);
		f.display();
		f.accept("Sachin", 507,83);
		f.display();
		f.accept("Dhanashree", 508,69);
		f.display();
		f.accept("Riya", 509,79);
		f.display();
		
	}

}
