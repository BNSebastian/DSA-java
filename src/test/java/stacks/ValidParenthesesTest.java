package stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    public void validParenthesesTest() {
        var instance = new ValidParentheses();
        assertTrue(instance.validParentheses("()"));
        assertTrue(instance.validParentheses("()[]{}"));
        assertFalse(instance.validParentheses("(]"));
    }
}