import java.util.Hashtable;
import java.util.Set;

public class hashtableex
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		h.put(6,"Niraj");
		h.put(1,"Jeet");
		h.put(2,"Nikita");
		h.put(3,"Yogita");
		h.put(5, "Om");
		h.put(4, "Prakash");
		Set<Integer> s = h.keySet();
		for(Integer k:s)
		{
			System.out.println(k+ " "+h.get(k));
		}
	}

}
