package map.crackingTheCodingInterview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueTest {

    @Test
    public void testOne() {
        var instance = new IsUnique();
        assertTrue(instance.isUnique("abcd"));
        assertFalse(instance.isUnique("aabcd"));
    }
}