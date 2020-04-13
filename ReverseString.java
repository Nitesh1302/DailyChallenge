package javaInterviewPrograms;

public class ReverseString {
	public static void main(String args[]) {
		String str= "Nitesh is a good boy";
		// System.out.println(reverseWithStringBuffer(str));
		// System.out.println(reverseWithoutStringBuffer(str));
		// reverseOnlyWords(str);
		reverseWordWithoutPosition(str);
		}
	
	//Reverse Whole sentence as it is way 1
	public static StringBuffer reverseWithStringBuffer(String str) {
		
		StringBuffer st= new StringBuffer(str);
		StringBuffer rev= st.reverse();
		return rev;
	}
	
	//Reverse Whole sentence as it is way 2
	public static String reverseWithoutStringBuffer(String str) {
		String	rev="";
		for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
		}
		return rev;
	}
	
	//Reverse words not charactors of the word 
	public static void reverseOnlyWords(String str) {
		String arr[]= str.split(" ");
		String rev="";
		for(int i=arr.length-1;i>=0;i--) {
			rev+=arr[i]+" ";
		}
		System.out.println(rev);
	}

	//Reverse words not positions of the word
	public static void reverseWordWithoutPosition(String str) {
		String rev="";
		String arr[]= str.split(" ");
		for(String st:arr) {
			for(int i=st.length()-1;i>=0;i--) {
				rev+=st.charAt(i);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}
}
