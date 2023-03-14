package arrays.codewars;

/****** Task ******
 * Create a function that accepts a list/array and a number n,
 * and returns a list/array of the first n elements from the list/array.
 */

public class EnumerableMagic {

    public int[] take(int[] arr, int n) {
        if (n <= 0 || n >= arr.length) {
            return null;
        }

        int[] output = new int[n];
        System.arraycopy(arr, 0, output, 0, n);
        return output;
    }

}
