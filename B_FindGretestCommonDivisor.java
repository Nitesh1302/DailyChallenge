
public class B_FindGretestCommonDivisor {

	public static void main(String[] args) {

		findGCD(35,105);
		FindoutGCD(27,108);

	}
	 
	//Way1
	public static void findGCD(int a , int b) {
		int gcd=1;
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
	}
	
	//Way2

	public static void FindoutGCD(int a , int b) {
		while(a!=b)
			if(a>b) {
				a-=b;
			}
			else {
				b-=a;
			}
		
		System.out.println(a);
	}
	
}
