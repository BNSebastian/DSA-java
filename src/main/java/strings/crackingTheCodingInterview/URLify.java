package strings.crackingTheCodingInterview;

/**
 *  Write a method to replace all spaces in a string with '%20'. You may assume
 *  that the string has sufficient space at the end to hold the additional characters,
 *  and that you are given the "true" length of the string. (Note: If implementing in Java,
 *  please use a character array so that you can perform this operation in place.)
 */

public class URLify {

    public static String urlify(String input) {
        StringBuilder output = new StringBuilder();
        for (char current : input.toCharArray()) {
            if (current == ' ') {
                output.append("%20");
            } else {
                output.append(current);
            }
        }
        return output.toString();
    }

}
