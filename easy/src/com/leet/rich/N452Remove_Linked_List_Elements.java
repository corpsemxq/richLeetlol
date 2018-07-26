package com.leet.rich;


import com.leet.rich.util.ListNode;

/**
 * https://www.lintcode.com/problem/remove-linked-list-elements/description
 Description
 Remove all elements from a linked list of integers that have value val.

 Example
 Given 1->2->3->3->4->5->3, val = 3, you should return the list as 1->2->4->5
 */
public class N452Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return head;
        }
        while(head.val == val){
            head = head.next;
            if (head == null){
                return head;
            }
        }
        ListNode current = new ListNode(head.val);
        head = head.next;
        while(head != null && head.val == val){
            head = head.next;
        }
        current.next = head;
        while (head != null && head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
            }
            head = head.next;
        }
        return current;
        // write your code here
    }
}
