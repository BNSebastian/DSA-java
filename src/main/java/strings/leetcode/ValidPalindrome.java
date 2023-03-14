package strings.leetcode;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome/">...</a>
 * ----------
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 * removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *-----------
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *-----------
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 */

public class ValidPalindrome {

    public boolean isPalindrome(String word) {
        word = word.toLowerCase().replaceAll("[^0-9a-z]","");
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }

}
