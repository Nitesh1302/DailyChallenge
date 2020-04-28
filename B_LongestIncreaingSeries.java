
public class B_LongestIncreaingSeries {

	public static void main(String[] args) {
		int arr[]= {12,73,23,38,42,79,91,60,7,5,6,7,8,9,10};
		int var=1;int max=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]>arr[i]) {
				var++;
				if(var>max) {
					max=var;
				}
			}
			else {
				var=1;
			}
		}
		System.out.println("longest increaing length size is "+max);

	}

}
