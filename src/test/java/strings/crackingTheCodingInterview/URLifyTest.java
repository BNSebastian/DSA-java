package strings.crackingTheCodingInterview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLifyTest {

    @Test
    public void testOne() {
        assertEquals("Test%20one", URLify.urlify("Test one"));
    }

}