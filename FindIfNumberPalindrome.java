

public class FindIfNumberPalindrome {
	// One way to check this

	static int temp = 0;

	public static void main(String[] args) {
		int d = 232;
		String s = "pdp";
		checkAnythingPalindrome(s);
	}

	public static void checkPalindrome(int num) {
		String str = num + "";
		System.out.println(str);
		char[] arr = str.toCharArray();
		int l = arr.length - 1;
		System.out.println("length of an array is: :" + l);
		for (int i = 0; i < l / 2; i++) {
			if (arr[i] != arr[l - i]) {
				temp++;
			}
		}
		if (temp == 0) {
			System.out.println("number is palindrom");
		} else
			System.out.println("number is not palindrome");
	}

	// Another way to check this
	public static void checkAnythingPalindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		System.out.println(rev);
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String isn't palindrome");
		}
	}
}