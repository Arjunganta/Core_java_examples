package com.arjun;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumberOfCharacterOccurances {
	public Map<Character, Integer> getNumberOfCharacters(String value) {
		ArrayList<Character> uniqueChars = new ArrayList<Character>();
		LinkedHashMap<Character, Integer> char_count = new LinkedHashMap<Character, Integer>();
		String name = value;
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

		return char_count;

	}

	public static void main(String[] args) {
		NumberOfCharacterOccurances occurances = new NumberOfCharacterOccurances();
		Map<Character, Integer> char_count = occurances.getNumberOfCharacters("fdjldsjlfjeidfjskdljflkjs");
		for (Map.Entry<Character, Integer> chars : char_count.entrySet()) {
			System.out.println(chars.getKey() + " " + chars.getValue());

		}

	}
}
