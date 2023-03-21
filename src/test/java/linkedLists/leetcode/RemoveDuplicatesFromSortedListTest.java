package linkedLists.leetcode;

import linkedLists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListTest {

    @Test
    public void testOne() {
        ListNode tempList = ListNode.createList(new int[] {1,1,2});
        RemoveDuplicatesFromSortedList.deleteDuplicates(tempList);
        int[] input = new int[ListNode.listLength(tempList)];
        input = ListNode.createArrayFromList(tempList);
        assertArrayEquals(new int[] {1,2}, input);

    }

    @Test
    public void testTwo() {
        ListNode tempList = ListNode.createList(new int[] {1,1,2,3,3});
        RemoveDuplicatesFromSortedList.deleteDuplicates(tempList);
        assertArrayEquals(
                new int[] {1,2,3},
                ListNode.createArrayFromList(tempList));
    }

}