package stacks;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/valid-parentheses/">...</a>
 * ----------
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * An input string is valid if:
 *     Open brackets must be closed by the same type of brackets.
 *     Open brackets must be closed in the correct order.
 *     Every close bracket has a corresponding open bracket of the same type.
 * ----------
 * Example 1:
 * Input: s = "()"
 * Output: true
 * ----------
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * ----------
 * Example 3:
 * Input: s = "(]"
 * Output: false
 */

public class ValidParentheses {

    public boolean validParentheses(String input) {
        Stack<Character> stack = new Stack<Character>();

        for (char current : input.toCharArray()) {

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if (stack.empty()) {
                return false;
            } else {
                if (current == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (current == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (current == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

}
