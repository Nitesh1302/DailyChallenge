import java.util.Arrays;

public class B_SortAnArray {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 5, 6, 11, 7, 2, 1, 6, 2, 3, 3 };
		sorrtArrayInAscendingOrder(arr);
		SortArrayWithInbuildFuntion(arr);

	}

	//Way 1
	public static void sorrtArrayInAscendingOrder(int arr[]) {
		int temp=0;
		for (int j = 0; j< arr.length-1; j++) {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}

		}
		for(int a:arr)
			System.out.print(a+" ");
	}
	
	
	//Way2
	public static void SortArrayWithInbuildFuntion(int[] arr) {
		Arrays.sort(arr);
		System.out.println();
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
	}
}
