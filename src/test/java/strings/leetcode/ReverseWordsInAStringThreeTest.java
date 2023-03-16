package strings.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringThreeTest {

    @Test
    public void testOne() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", ReverseWordsInAStringThree.reverseWords("Let's take LeetCode contest"));
    }
}