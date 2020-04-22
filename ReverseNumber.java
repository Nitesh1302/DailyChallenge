

public class ReverseNumber {
	public static void main(String args[]) {
		// reverseNumber();
		/*int i=revNum(12345);
		System.out.println(i);*/
		
		reverseNum(123);
	}

	// Layman programming- Method 1
	public static void reverseNumber() {
		int i = 123;
		int a = 123 % 10;
		i = i / 10;
		int b = i % 10;
		i = i / 10;
		int c = i % 10;
		String revnum = a + "" + b + "" + c;
		System.out.println(revnum);
	}

	//Method 2
	public static int revNum(int num) {
		int rem,rev=0;
		while(num!=0) {
		rem= (num%10);
		rev=rev*10+rem;
		num=num/10;
		
			}
		return rev;
		}
	
	//Methods 3
	public static void reverseNum(int num) {
		while (num !=0) {
			if (num < 10) {
				System.out.print(num);
				return;
			} else {
				System.out.print(num % 10);
				num = num / 10;
			}
		}
	}
}