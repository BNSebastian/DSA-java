package map.crackingTheCodingInterview;

import java.util.HashMap;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */

public class IsUnique {

    public boolean isUnique(String input) {
        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (char current : input.toCharArray()) {
            if (letterCount.get(current) == null) {
                letterCount.putIfAbsent(current, 1);
            } else {
                letterCount.put(current, letterCount.get(current) + 1);
            }

        }
        for (int value : letterCount.values()) {
            if (value > 1) {
                return false;
            }
        }

        return true;
    }
}
