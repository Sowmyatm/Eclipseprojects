//largest of 3 nos using nested if
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10, b=1, c=100;
		if (a>b) 
		{
			if(a>c)
			{
				System.out.println(a + " is largest");
			}
		}
		if (b>a)
		{
			if(b>c)
			{
				System.out.println(b + " is largest");
			}
		}
		if(c>a)
		{
			if(c>b)
			{
				System.out.println(c + " is largest");
			}
		}
	}

}
