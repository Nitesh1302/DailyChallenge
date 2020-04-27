
public class B_DisplayPrimeNumberBetweenARange {
	
	public static void main(String args[]) {
	
		displayAllPrimeNumberBetween(2,50);
	}

	public static void displayAllPrimeNumberBetween(int a, int b){
		
		System.out.println("Prime numbers are");
	loop1:	for(int i=a;i<b;i++) {
				int var=0;
		loop2:	for(int j=2;j<i;j++) {
				if(i%j==0) {
				var++;
				continue loop1;
				}
			}
			if(var==0) {
				System.out.printf(i+"," );
			}
		}
	}
}
