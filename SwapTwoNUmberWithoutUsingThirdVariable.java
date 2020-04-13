package javaInterviewPrograms;

public class SwapTwoNUmberWithoutUsingThirdVariable {
	public static void main(String args[]) {
		int a=16;
		int b=3;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+ " and "+ b);
	}

}
