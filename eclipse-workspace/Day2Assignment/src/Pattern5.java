
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<5; i++)
		{
			int num =1;
			for(int j=0,spaces=4;j<=i;j++,spaces--)
			{
	//			System.out.print( " " + repeat(spaces) + "*");
				num++;
			}
			System.out.println(" ");
			//System.out.println();
		}
		for(int i=4; i>0; i--)
		{
			int num =1;
			for(int j=1; j<=i; j++)
			{
				System.out.print(" " + " " + "*");
				num++;
				
					
			}
			System.out.println();
		}
	}

}
