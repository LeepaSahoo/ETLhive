
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13;
		int half=a/2;
		int i=2;
		boolean result=false;
		while(i<half)
		{
			if(a%i==0) 
			{
				result=true;
				break;
			}
			i++;
		}
		if(result==true)
		{
			System.out.println(a + " is not a prime number");
		}
		else
			System.out.println(a + " is a prime number");

	}

}
