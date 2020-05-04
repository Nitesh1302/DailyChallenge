import java.util.Scanner;

public class B_LeftShiftArranyByNPosition {

	public static void main(String[] args) {

		
		Scanner cs= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n= cs.nextInt();
		int a[] = new int[n];
		System.out.println("Enter you numbers");
		for(int p=0;p<n;p++) {
			a[p]=cs.nextInt();
		}
		
		System.out.println("Enter the length you want to shift the array");
		int pos= cs.nextInt();		
		
		System.out.println("original array is below");
		for (int x : a) {
			System.out.print(x + " ");
		}

		shiftLeft(a, pos);
	}

	public static void shiftLeft(int a[], int n) {
		int b[] = new int[n];
		int c[] = new int[a.length - n];
		int d[] = new int[a.length];
		int t = 0;
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}
		for (int j = n; j <= a.length - 1; j++) {
			c[j - n] = a[j];
		}
		for (int k = 0; k < a.length; k++) {
			if (k >= c.length) {
				d[k] = b[t];
				t++;
			} else {
				d[k] = c[k];
			}
		}
		System.out.println();
		System.out.println("after left shift, it looks like below");
		for (int y : d) {
			System.out.print(y + " ");
		}

	}

}
