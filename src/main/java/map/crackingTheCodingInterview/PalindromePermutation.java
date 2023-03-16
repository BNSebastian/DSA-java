package map.crackingTheCodingInterview;

import java.util.HashMap;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 */

public class PalindromePermutation {

    public static boolean isPalindrome (String input) {
        String original = input.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static boolean isPalindromePermutation(String input) {
        String original = input.toLowerCase().replaceAll("[^A-Za-z0-9]","");

        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (char current : original.toCharArray()) {
            if (letterCount.get(current) == null) {
                letterCount.putIfAbsent(current, 1);
            } else {
                letterCount.put(current, letterCount.get(current) + 1);
            }
        }
        int oddCount = 0;
        for (int currentValue : letterCount.values()) {
            if (currentValue % 2 == 1) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }

}
