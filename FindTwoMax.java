

public class FindTwoMax {


	public static void main(String args[]) {
		int arr[] = { 1,2,6,2,4,6 };
		topTwo(arr);
		findTopTwo(arr);
	}

	// Way 1
	public static void topTwo(int arr[]) {
		int var = 0;
		int top1 = 0, top2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (top1 < arr[i]) {
				top1 = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (top2 < arr[i] && arr[i] < top1) {
				top2 = arr[i];
			}
		}
		System.out.println(top1);
		System.out.println(top2);
	}
	
	//Way 2
	public static void findTopTwo(int arr[]) {
		int top1=0;int top2=0;
		for(int n:arr) {
			if(n>top1) {
				top2=top1;
			top1=n;
			}
			else if(n>top2) {
				top2=n;
			}
		}
		System.out.println(top1 +" and "+ top2);
		
	}

}
