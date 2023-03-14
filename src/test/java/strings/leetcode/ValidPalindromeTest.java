package strings.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void validPalindromeTest() {
        var test = new ValidPalindrome();
        assertEquals(true, test.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, test.isPalindrome("race a car"));
    }
}