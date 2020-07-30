package com.arjun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class Non_repeatedCharacters {
	public static void main(String[] args) {
		ArrayList<Character> uniqueChars = new ArrayList<Character>();

		LinkedHashMap<Character, Integer> char_count = new LinkedHashMap<Character, Integer>();

		String name = "arafdqslykfzajjjjjjunahjkhjheudfdqsdhjr";
		for (int i = 0; i < name.length(); i++) {
			if (!uniqueChars.contains(name.charAt(i)))
				uniqueChars.add(name.charAt(i));
		}

		for (int k = 0; k < uniqueChars.size(); k++) {
			int count = 0;
			for (int z = k; z < name.length(); z++) {
				if (String.valueOf(uniqueChars.get(k)).equals(String.valueOf(name.charAt(z)))) {

					char_count.put(uniqueChars.get(k), ++count);
				}

			}

		}
		for (Map.Entry<Character, Integer> chars : char_count.entrySet()) {
			System.out.println(chars.getKey() + " " + chars.getValue());
			if (chars.getValue() == 1) {

				System.out.println("the first non_repeated character in the array is " + chars.getKey());
				break;

			}
		}

	}

}
