
public class GenerateFourDigitNumberWithPositionalValues {

	public static void main(String[] args) {
		int num = 9999;
		AddThePositionalValue(num);
	}

	public static void AddThePositionalValue(int n) {
		if (String.valueOf(n).length() != 4) {
			System.out.println("Please enter a four digit number");
		} else {
			int a = n % 10;
			n = n / 10;
			int b = n % 10;
			n = n / 10;
			int c = n % 10;
			n = n / 10;
			int d = n % 10;
			switch (d) {
			case 1:
				System.out.println("One Thousand");
				break;
			case 2:
				System.out.println("Two Thousand");
				break;
			case 3:
				System.out.println("Three Thousand");
				break;
			case 4:
				System.out.println("Four Thousand");
				break;
			case 5:
				System.out.println("Five Thousand");
				break;
			case 6:
				System.out.println("Six Thousand");
				break;
			case 7:
				System.out.println("Seven Thousand");
				break;
			case 8:
				System.out.println("Eight Thousand");
				break;
			case 9:
				System.out.println("Nine Thousand");
				break;
			}
			switch (c) {
			case 0:
				break;
			case 1:
				System.out.println("One Hundred");
				break;
			case 2:
				System.out.println("Two Hundred");
				break;
			case 3:
				System.out.println("Three Hundred");
				break;
			case 4:
				System.out.println("Four Hundred");
				break;
			case 5:
				System.out.println("Five Hundred");
				break;
			case 6:
				System.out.println("Six Hundred");
				break;
			case 7:
				System.out.println("Seven Hundred");
				break;
			case 8:
				System.out.println("Eight Hundred");
				break;
			case 9:
				System.out.println("Nine Hundred");
				break;
			}

			if (b > 1) {
				switch (b) {
				case 2:
					System.out.println("Twenty");
					break;
				case 3:
					System.out.println("Thirty ");
					break;
				case 4:
					System.out.println("Fourty ");
					break;
				case 5:
					System.out.println("Fifty ");
					break;
				case 6:
					System.out.println("Sixty ");
					break;
				case 7:
					System.out.println("Seventy ");
					break;
				case 8:
					System.out.println("Eighty ");
					break;
				case 9:
					System.out.println("Ninty ");
					break;
				}
			}
			if (b == 1) {
				switch (a) {
				case 1:
					System.out.println("Eleven");
					break;
				case 2:
					System.out.println("Tweleve");
					break;
				case 3:
					System.out.println("Thirteen ");
					break;
				case 4:
					System.out.println("Fourteen ");
					break;
				case 5:
					System.out.println("Fifteen ");
					break;
				case 6:
					System.out.println("Sixteen ");
					break;
				case 7:
					System.out.println("Seventeen");
					break;
				case 8:
					System.out.println("Eighteen ");
					break;
				case 9:
					System.out.println("Ninteen");
					break;
				}
			} else {
				switch (a) {
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three ");
					break;
				case 4:
					System.out.println("Four ");
					break;
				case 5:
					System.out.println("Five ");
					break;
				case 6:
					System.out.println("Six ");
					break;
				case 7:
					System.out.println("Seven ");
					break;
				case 8:
					System.out.println("Eight ");
					break;
				case 9:
					System.out.println("Nine ");
					break;

				}

			}
		}
	}
}