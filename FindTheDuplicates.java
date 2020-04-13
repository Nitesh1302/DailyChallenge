package javaInterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindTheDuplicates {

	public static void main(String[] args) {

		String arr[] = { "aa", "dd", "aa", "cc", "bb", "cc", "aa"};
		findDuplicates(arr);
	}
	
	public static void findDuplicates(String arr[]) {
		Map<String, Integer>map = new HashMap<>();
		for(String str:arr) {
			if(!map.containsKey(str)) {
				map.put(str,1);
			}
			else {
				map.put(str, map.get(str)+1);
			}
		}
		System.out.println(map);
		Set<String> set= map.keySet();
		System.out.println(set);
		for(String st:set) {
		if(!set.add(st))
			System.out.println(st);
		}			
		}
	}

