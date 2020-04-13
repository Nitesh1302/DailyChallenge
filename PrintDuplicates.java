/*Purpose
1. Print the duplicate numbers 
2. Delete the duplicate numbers
*/
package javaInterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicates {
	// Input :
	static int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2,7,1};

	public static void main(String args[]) {
		printDuplicate();
	}

	// ContainsKey to check if key is present already
	// to increase the count- user "get method to get the count +1"
	public static void printDuplicate() {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else
				map.put(arr[i], map.get(arr[i]) + 1);
		}
		System.out.println(map);
		System.out.println("------------");
		//Print keys which have been repeated more than on
		for (int j = 0; j< map.size(); j++) {
			if (map.get(arr[j]) > 1)
				System.out.println((arr[j]));
		}
	}
}
