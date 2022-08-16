package com.homo.computronium.leetcode.easy.e0209.copy_nodes;

import com.homo.computronium.leetcode.easy.e0209.ListNode;
import com.homo.computronium.leetcode.easy.e0209.ReverseLinkedList;

// 206. Reverse Linked List
// https://leetcode.com/problems/reverse-linked-list/
public class Solution0209 implements ReverseLinkedList {

    @Override
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode currNode = new ListNode();
        ListNode prevNode = null;

        boolean firstIteration = true;
        while (head.next != null) {
            if (firstIteration) {
                currNode.val = head.val;
                firstIteration = false;
                prevNode = currNode;
                head = head.next;
                continue;
            }
            currNode = new ListNode();
            currNode.val = head.val;
            currNode.next = prevNode;
            prevNode = currNode;
            head = head.next;
        }

        currNode = new ListNode();
        currNode.val = head.val;
        currNode.next = prevNode;
        prevNode = currNode;
        head = head.next;

        return currNode;
    }
}
