package strings.leetcode;

/**
 * <a href="https://leetcode.com/problems/excel-sheet-column-number/">...</a>
 * ----------
 * Given a string columnTitle that represents the column title as appears in an Excel sheet,
 * return its corresponding column number.
 *-----------
 * Example 1:
 * Input: columnTitle = "A"
 * Output: 1
 *-----------
 * Example 2:
 * Input: columnTitle = "AB"
 * Output: 28
 */

public class ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {
        int total = 0;
        for (int i = 0; i < columnTitle.length(); i ++)
        {
            int currentNumber = columnTitle.charAt(i) - 64;
            total = total * 26 + currentNumber;
        }
        return total;
    }

}
