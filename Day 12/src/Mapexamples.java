import java.util.HashMap;
import java.util.Set;

public class Mapexamples
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(1,"Jeet");
		h.put(2, "Nikita");
		h.put(7, "Yogita");
		h.put(4, "Om");
		System.out.println(h);
		Set<Integer> s=h.keySet();
		for(Integer k:s)
		{
			System.out.println(k+ " " + h.get(k));
		}
	}

}
