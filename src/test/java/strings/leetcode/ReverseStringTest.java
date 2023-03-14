package strings.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseStringTest() {
        var test = new ReverseString();

        char[] input1 = {'h','e','l','l','o'};
        test.reverseString(input1);
        char[] output1 = {'o','l','l','e','h'};
        assertArrayEquals(output1, input1);

        char[] input2 = {'h','a','n','n','a','h'};
        test.reverseString(input2);
        char[] output2 = {'h','a','n','n','a','h'};
        assertArrayEquals(output2, input2);
    }

}