import java.util.Scanner;

public class B_PrintSumOfTwoMatrix {

	public static void main(String[] args) {
		addTwoMatrix();
	}

	public static void addTwoMatrix() {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("Enter " + i + "he row " + j + "th column value");
				a[i][j] = sc.nextInt();
							}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.println("Enter " + i + "he row " + j + "th column value");
				b[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.println("Sum of " + i + "th row and" + j + "th column is");
				System.out.println(c[i][j] = a[i][j] + b[i][j]);
			}
		}
	}
}
