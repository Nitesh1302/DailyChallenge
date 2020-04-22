

public class CheckIfNumberIsPrime {

	static int t=0;
	public static void main(String args[]) {
		int n = 11;

		for(int i=n/2;i>=2;i--) {
			if(n%i==0)
			{
				t++;
			}
		}
		if(t>0) {
			System.out.println("number is not prime");
		}
		else
			System.out.println("number is prime");
		
	}
}

