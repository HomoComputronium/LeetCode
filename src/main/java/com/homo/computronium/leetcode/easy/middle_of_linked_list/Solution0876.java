package com.homo.computronium.leetcode.easy.middle_of_linked_list;

// 876. Middle of the Linked List
// https://leetcode.com/problems/middle-of-the-linked-list/
public class Solution0876 {
    public ListNode middleNode(ListNode head) {
        ListNode initialHead = head;

        int count = getLength(head);

        int middle = count / 2;

        return getNode(initialHead, middle);
    }

    private ListNode getNode(ListNode initialHead, int index) {
        if (index == 0) {
            return initialHead;
        }

        int count = 0;
        while (initialHead.next != null) {
            count++;
            initialHead = initialHead.next;

            if (count == index) {
                return initialHead;
            }
        }

        return null;
    }

    private int getLength(ListNode head) {
        int count = 1;
        while (head.next != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}