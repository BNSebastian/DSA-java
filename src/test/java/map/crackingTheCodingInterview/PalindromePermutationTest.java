package map.crackingTheCodingInterview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationTest {

    @Test
    public void testOne() {
        assertTrue(PalindromePermutation.isPalindrome("Taco cat"));
        assertFalse(PalindromePermutation.isPalindrome("Tac cat o"));
        assertTrue(PalindromePermutation.isPalindromePermutation("Tac cat o"));
    }

}