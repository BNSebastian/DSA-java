package bitManipulation.leetcode;

/**
 * <a href="https://leetcode.com/problems/number-of-1-bits/">...</a>
 * ----------
 * Write a function that takes the binary representation of an unsigned integer
 * and returns the number of '1' bits it has (also known as the Hamming weight).
 * Note:
 * 1) Note that in some languages, such as Java, there is no unsigned integer type.
 * In this case, the input will be given as a signed integer type.
 * It should not affect your implementation, as the integer's internal binary representation is the same,
 * whether it is signed or unsigned.
 * 2) In Java, the compiler represents the signed integers using 2's complement notation.
 * Therefore, in Example 3, the input represents the signed integer. -3.
 *-----------
 * Example 1:
 * Input: n = 00000000000000000000000000001011
 * Output: 3
 * Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
 *-----------
 * Example 2:
 * Input: n = 00000000000000000000000010000000
 * Output: 1
 * Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
 */

public class NumberOfOneBits {

    public int hammingWeight(int n) {
        int occurrence = 0;
        String bitwiseRepresentation = Integer.toBinaryString(n);
        for (char current : bitwiseRepresentation.toCharArray()) {
            if (current == '1') { occurrence ++; }
        }
        return occurrence;
    }

}
