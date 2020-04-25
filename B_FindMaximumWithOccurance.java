import java.util.Scanner;

public class B_FindMaximumWithOccurance {
	static int max=0;
	static int c=0;
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int arr[]= {1,2,3,2,4,4,4,4,4};
		max=arr[1];
		for(int i=1;i<arr.length;i++) {
			System.out.printf(arr[i]+" ");
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==max) {
				c++;
			}
		}
		System.out.println();
		System.out.println("maximun number is "+max+" and it appeared for "+ c + " times");
	}

}
