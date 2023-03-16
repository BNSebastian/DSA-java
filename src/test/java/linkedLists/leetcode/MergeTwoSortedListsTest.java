package linkedLists.leetcode;

import linkedLists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    public void testOne() {
        int[] outputArray1 = new int[] {1, 1, 2, 3, 4, 4};
        int[] inputArray11 = new int[] {1, 2, 4};
        int[] inputArray12 = new int[] {1, 3, 4};

        ListNode inputList11 = ListNode.createList(inputArray11);
        ListNode inputList12 = ListNode.createList(inputArray12);
        ListNode test1 = MergeTwoSortedLists.mergeTwoLists(inputList11, inputList12);
        assertArrayEquals(outputArray1, ListNode.createArrayFromList(test1));
    }
}