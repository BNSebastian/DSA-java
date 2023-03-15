package queue.leetcode;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStudentsUnableToEatLunchTest {

    public void numberOfStudentsUnableToEatLunchTest() {
        var test = new NumberOfStudentsUnableToEatLunch();
        assertEquals(0, test.countStudents(new int[] {1,1,0,0}, new int[] {0,1,0,1}));
    }
}