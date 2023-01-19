//skip 5 and continue till 10
public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i=1;i<=10;i++)
			//if the value of i is 5 the loop terminates
		{
			if (i==5)
				
			{
				System.out.println("-");
				continue;
			}
			System.out.println(i);
		}

	}

}
