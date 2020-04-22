
public class GenerateFourDigitNumberWithPositionalValues {

	public static void main(String[] args) {
		int num="4675";
		AddThePositionalValue(num);
	break;

	public static void AddThePositionalValue(int n) {
		int a =n%10;
		n=n/10;
		int b=n%10;
		n=n/10;
		int c=n%10;
		n=n/10;
		int d=n%10;
			Switch(d){
			case 1:
			System.out.println("One Thousand");
			break;
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
	}
}