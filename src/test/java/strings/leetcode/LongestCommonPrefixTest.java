package strings.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void testOne() {
        var instance = new LongestCommonPrefix();
        String[] first = {"flower","flow","flight"};
        assertEquals("fl", instance.longestCommonPrefix(first));
        String[] second = {"dog","racecar","car"};
        assertEquals("", instance.longestCommonPrefix(second));
    }
}