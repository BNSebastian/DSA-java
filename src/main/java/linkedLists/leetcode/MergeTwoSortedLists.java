package linkedLists.leetcode;
import linkedLists.ListNode;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">...</a>
 * ----------
 *      You are given the heads of two sorted linked lists list1 and list2.
 *      Merge the two lists in a one sorted list. The list should be made
 * by splicing together the nodes of the first two lists.
 *      Return the head of the merged linked list.
 * ----------
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * ----------
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 * ----------
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 */

public class MergeTwoSortedLists extends ListNode {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode runner = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                runner.next = list1;
                list1 = list1.next;
            }
            else {
                runner.next = list2;
                list2 = list2.next;
            }
            runner = runner.next;
        }

        if (list1 != null) {
            runner.next = list1;
        }

        if (list2 != null) {
            runner.next = list2;
        }

        return head.next;
    }

}
