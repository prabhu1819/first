
public class arrayexample {

	public static void main(String[] args) 
	{
		int a[]=new int[5];//int a[]={1,2,3,4} can also assign in this type;
		a[0]=54;
		a[1]=11;
		a[2]=24;
		a[3]=11;
		a[4]=47;
		for(int i=0;i<5;i++) 
		{
			System.out.println(a[i]);
		}
		String s[]=new String[3];
		s[0]="Hi";
		s[1]="where are you from";
		s[2]="How are you doig?";
		for(int i=0;i<3;i++) 
		{
			System.out.println(s[i]);
		}
	}

}
