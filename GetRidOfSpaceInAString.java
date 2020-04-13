package javaInterviewPrograms;

public class GetRidOfSpaceInAString {

	public static void main(String[] args) {
		String str = "My Country Name Is India";
		removeSpace(str);
	}

	// Way1
	public static void removeSpace(String str) {
		String rmSpace = "";

		String st[] = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			rmSpace = rmSpace + st[i];
		}
		System.out.println(rmSpace);
	}
}
