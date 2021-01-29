Way1

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

Way2 (To Print all prime numbers from an array )

public class CheckIfNumberIsPrime {

  public static void main(String args[]) {
    int arr[] = {1, 2, 3, 5, 7, 11, 13, 17, 21, 23, 24, 67, 100, 103, 105};
    checkPrimeNumbers(arr);
  }

  public static void checkPrimeNumbers(int arr[]) {
    loop1:
    for (int j = 0; j < arr.length; j++) {
      loop2:
      for (int i = 2; i < arr[j]; i++) {
        if (arr[j] % i == 0) {
          continue loop1;
        }
      }
      System.out.print(arr[j] + " ");
    }
  }
}
