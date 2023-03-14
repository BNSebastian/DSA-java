package arrays.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumerableMagicTest {

    @Test
    void testOne() {
        var instance = new EnumerableMagic();
        int[] input = {1, 2, 3, 4,5 };
        int[] output = {1, 2};
        assertArrayEquals(output, instance.take(input, 2));
    }
}