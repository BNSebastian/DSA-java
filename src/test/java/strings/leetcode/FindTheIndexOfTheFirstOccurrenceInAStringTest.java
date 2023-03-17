package strings.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    public void testOne() {
        assertEquals(0, FindTheIndexOfTheFirstOccurrenceInAString.findOccurence("sadbutsad", "sad"));
        assertEquals(-1, FindTheIndexOfTheFirstOccurrenceInAString.findOccurence("leetcode", "leeto"));
    }
}