package com.homo.computronium.leetcode.easy.e0209.array;


import com.homo.computronium.leetcode.easy.e0209.ListNode;
import com.homo.computronium.leetcode.easy.e0209.ReverseLinkedList;

import java.util.ArrayList;
import java.util.List;

// 206. Reverse Linked List
// https://leetcode.com/problems/reverse-linked-list/
public class Solution0209 implements ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        List<ListNode> listNodes = new ArrayList<>();

        while (head.next != null) {
            listNodes.add(head);
            head = head.next;
        }
        listNodes.add(head);

        ListNode newHead = null;
        for (int i = 0; i < listNodes.size(); i++) {
            if (i == 0) {
                newHead = listNodes.get(i);
                newHead.next = null;
                continue;
            }
            ListNode node = listNodes.get(i);
            node.next = newHead;
            newHead = node;
        }
        return newHead;
    }
}
