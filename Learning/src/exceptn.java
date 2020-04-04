	
public class exceptn {

	public static void main(String[] args) {
			try
			{
				int x=20;
				int y=1;
				int z=x/y;
				System.out.println(z);
				System.exit(0);

		}
			catch(ArithmeticException e)
			{
				System.out.println("divided by zero");
				e.printStackTrace();
			}
			finally
			{
				System.out.println("ugfrvdfv");
			}
	}

}
