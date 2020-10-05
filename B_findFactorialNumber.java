import java.util.Scanner;

public class B_findFactorialNumber {

	public static void main(String args[]) {
		int num;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number: ");
		num= input.nextInt();
		System.out.println(findFact(num));
	}

//Factorial with loop - way1
	public static int findFact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		int p=1;
		for(int i=n;i>0;i--) {
			p*=i;
		}
		return (p);
	}
	
//factorial with recursion - Way 2
	 public static int findFactorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return (n * findFact(n - 1));
    }
  }
}
