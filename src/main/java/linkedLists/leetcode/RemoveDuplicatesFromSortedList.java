package linkedLists.leetcode;

import linkedLists.ListNode;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/">...</a>
 * ----------
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * ----------
 * Example 1:
 * Input: head = [1,1,2]
 * Output: [1,2]
 * ----------
 * Example 2:
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 */

public class RemoveDuplicatesFromSortedList extends ListNode {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode runner = head;

        while (runner != null && runner.next != null){
            // if values are equal, skip 1 node
            if (runner.val == runner.next.val) {
                runner.next = runner.next.next;
                continue;
            }
            // if values aren't equal, transition to the next element
            runner = runner.next;
        }
        return head;

    }

}
