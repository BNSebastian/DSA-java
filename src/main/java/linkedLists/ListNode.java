package linkedLists;

import java.util.ArrayList;

public class ListNode {

     public int val;
     public ListNode next;

     public ListNode() {}

     public ListNode(int val) {
         this.val = val;
     }

     public ListNode(int val, ListNode next) {
         this.val = val;
         this.next = next;
     }

     public static ListNode createList (int[] input) {

         ListNode output = new ListNode(0);
         ListNode runner = output;

         for (int current : input) {
             runner.val = current;
             ListNode temp = new ListNode(0);
             runner.next = temp;
             runner = temp;
         }

         return output;
     }

     public static int listLength (ListNode input) {
         int output = 0;
         while (input != null) {
             output++;
         }
         return output;
     }

     public static int[] createArrayFromList(ListNode input) {
         int[] output = new int[listLength(input)];
         int i = 0;

         while (input != null) {
             output[i] = input.val;
             i++;
             input = input.next;
         }

         return output;
     }

 }