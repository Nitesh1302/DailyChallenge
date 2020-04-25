import java.util.Scanner;

public class B_CheckSingleDigitAppersInMultiDIgitValue {
	
	static int c=0;
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a 5 digit number");
		int multiDigitNumber= sc.nextInt();
		System.out.println("Enter single digit number");
		int singleDigitNumber= sc.nextInt();
		
		int len= String.valueOf(multiDigitNumber).length();
		
		for(int i=0;i<len;i++) {
			if(multiDigitNumber%10==singleDigitNumber) {
				c++;
			}
			multiDigitNumber=multiDigitNumber/10;
		}
		if(c==0) {
			System.out.println("Single digit number doesn't appear in the multi digit number");
		}
		else {
			System.out.println("Yes, Single digit number appears in multi digit number and, "+c+" times");
		}
	}

}
