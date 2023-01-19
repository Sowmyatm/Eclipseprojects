package exam1;

public class Q1_Bool {
	int check_howmany_bool(boolean a, boolean b, boolean c)
	{
		int num_trues=0;
		if((a||b||c)==false) //checking if all variables are false
		{
			return(0);
		}
		if(a)
			num_trues++;
		
		if(b)
			num_trues++;
		if(c)
			num_trues++;
		return(num_trues);
		
	}

	public static void main(String[] args) {
		
		Q1_Bool bool = new Q1_Bool();
		
		System.out.println(bool.check_howmany_bool(false, false, false));
		System.out.println(bool.check_howmany_bool(false, true, false));
		System.out.println(bool.check_howmany_bool(true, true, true));
		System.out.println(bool.check_howmany_bool(true, true, false));
		
	}
}
