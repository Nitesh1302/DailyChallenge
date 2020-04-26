/*Pattern 1
1
22
333
4444
55555

*Pattern2
*
1
222
33333
4444444
555555555


Pattern 3
      1
     121
    12321
   1234321
  123454321   
  
  
Pattern 4
0
10
101
0101
01010

Pattern 5
0
12
345
6789
01234

Pattern 6
    *
   **
  ***
 ****
*****   
*
*
*/


import java.util.Scanner;

public class B_Patterns {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the depth for the pattern");
	int n= sc.nextInt();
	//	drawPattern1(n);
	//	drawPattern2(n);
	//	drawPattern3(n);
	//	drawPattern4(n);
		drawPattern5(n);
	//	drawPattern6(n);
	}
	
	 public static void drawPattern1(int n) {
		 for(int i=1;i<=n;i++) {
				 for(int j=1;j<=i;j++) { 
					 System.out.print(i);
				 }
				 System.out.println();
			 }
	 }
	 
	 public static void drawPattern2(int n) {
		 for(int i=1;i<=n;i++) {
				 for(int j=1;j<=(2*i)-1;j++) { 
					 System.out.print(i);
				 }
				 System.out.println();
			 }
		 }

	 public static void drawPattern3(int n) {
		 for(int i=1;i<=n;i++) {
				 for(int j=n;j>i;j--) { 
					 System.out.print(" ");
				 }
				 for(int k=1;k<=i;k++) { 
					 System.out.print(k);
				 }
				 for(int l=i-1;l>=1;l--) { 
					 System.out.print(l);
				 }
			 System.out.println();
		 }
	 }
	 
	 public static void drawPattern4(int n) {
		 int var=1;
		 for(int i=1;i<=n;i++) {
				 for(int j=1;j<=i;j++) { 
					 if(var%2==0) {
						 System.out.print("1");
					 }
					 else {
					 System.out.print("0");
				 }
					 
					 var++;
				}
				 System.out.println();
			 }
		 }
	 
	 public static void drawPattern5(int n) {
		 int var=0;
		 for(int i=1;i<=n;i++) {
				 for(int j=1;j<=i;j++) { 
						 System.out.print(var);
						 var++;
						 if(var>9) {
							 var=0;
						 }
						 
					 }
				 System.out.println();
		 }
	 }
	 
	 public static void drawPattern6(int n) {
		 for(int i=1;i<=n;i++) {
				 for(int j=n;j>i;j--) { 
					 System.out.print(" ");
				 }
				 for(int k=1;k<=i;k++) { 
					 System.out.print("*");
				 }
				 System.out.println();
			 }
	 }
}
