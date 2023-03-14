package numeric.leetcode;

/**
 * <a href="https://leetcode.com/problems/reverse-integer/">...</a>
 * ----------
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *-----------
 * Example 1:
 * Input: x = 123
 * Output: 321
 *-----------
 * Example 2:
 * Input: x = -123
 * Output: -321
 */

public class ReverseInteger {

    public int reverse1(int number) {
        String reversedString;
        long reversedNumber;
        if (number >= 0) {
            reversedString = new StringBuilder(String.valueOf(number)).reverse().toString();
            reversedNumber = Long.valueOf(reversedString);
        } else {
            reversedString = new StringBuilder(String.valueOf(number)).reverse().toString();
            reversedString = reversedString.substring(0, reversedString.length() - 1);
            reversedNumber = -Long.valueOf(reversedString);
        }

        if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)reversedNumber;
    }

    public int reverse2(int x) {
        long finalNum = 0;
        while (x != 0) {
            int lastDig = x % 10;
            finalNum += lastDig;
            finalNum = finalNum * 10;
            x /= 10;
        }
        finalNum = finalNum / 10;
        if (finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE) {
            return 0;
        }
        if(x < 0){
            return (int)(-1 * finalNum);
        }
        return (int)finalNum;
    }
}