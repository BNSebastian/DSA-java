package bitManipulation.leetcode;

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
