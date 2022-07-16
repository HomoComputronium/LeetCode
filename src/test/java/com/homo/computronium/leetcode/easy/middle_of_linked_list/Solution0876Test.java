package com.homo.computronium.leetcode.easy.middle_of_linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0876Test {

    @Test
    public void testLeetCodeCases() {
        Solution0876 solution = new Solution0876();

        //        [1,2,3,4,5]
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        assertEquals(3, solution.middleNode(head).val);

    }

    @Test
    public void testEvenLengthCase() {
        Solution0876 solution = new Solution0876();

        //        [1,2,3,4,5]
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        assertEquals(3, solution.middleNode(head).val);

    }
}