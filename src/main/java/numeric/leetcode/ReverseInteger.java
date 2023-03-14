package numeric.leetcode;

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