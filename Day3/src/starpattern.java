
public class starpattern 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,j,line=6;
		for(i=0;i<line;i++)
		{
			for(j=line-i;j>=1;j--)
			{
				System.out.print("");
			}
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
