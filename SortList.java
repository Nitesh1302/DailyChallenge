

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sagar");
		list.add("Nitesh");
		list.add("Anushka");
		list.add("Ashwini");
		list.add("Abhay");
		list.add("Renu");
		list.add("Vishal");
		
		Collections.sort(list);
		System.out.println(list);
	}

}
