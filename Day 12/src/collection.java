import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class collection 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(10);
		a.add(15);
		a.add(18);
		a.add(20);
		System.out.println(a);
		 
		LinkedList<String> s = new LinkedList<String>();
		s.add("Jeet");
		s.add("Amnur");
		s.add("Nikita");
		s.add("Yogita");
		System.out.println(s);
		Iterator<String>itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(15);
		i.add(20);
		Iterator<Integer>i1=i.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
