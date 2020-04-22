

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountTheWords {

	public static void main(String[] args) {

		// Array of char
		char arr[] = { 'a', 'a', 'n', 'e', 'r', 'r', 't', 'd', 'v', 'v', 'd', 'd', 'a' };
		countTheChar(arr);
		
		// A sentence
		String str= "Nitesh is a good boy";
		char a[]=str.toCharArray();
		countTheChar(a);
	}

	public static void countTheChar(char ch[]) {
		Map<Character, Integer> map = new HashMap<>();
		int total=0;
		for (char a : ch) {
			if (!map.containsKey(a)) {
				map.put(a, 1);
			} else {
				map.put(a, map.get(a) + 1);
			}
		}
		System.out.println(map);
	}

}
