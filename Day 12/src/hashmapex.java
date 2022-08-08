import java.util.LinkedHashMap;
import java.util.Set;

public class hashmapex  //linked hash map
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();
		l.put("Jeet", 50);
		l.put("Nikita", 10);
		l.put("Om", 20);
		Set<String> s = l.keySet();
		for(String k:s)
		{
			System.out.println(k+":" +l.get(k));
		}
	}

}
