import java.util.Scanner;

public class UserInputwithPrime {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter an number");
		int a= scn.nextInt();
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
