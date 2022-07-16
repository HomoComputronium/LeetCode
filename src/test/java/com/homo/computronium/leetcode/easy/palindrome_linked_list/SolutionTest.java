package com.homo.computronium.leetcode.easy.palindrome_linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testIsStringPalindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isStringPalindrome("abba"));
        assertTrue(solution.isStringPalindrome("abdba"));
        assertFalse(solution.isStringPalindrome("abdvba"));
    }

    @Test
    public void testLinkedListPalindromeCase1() {
        Solution solution = new Solution();
//        [1,2,2,1]
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        assertTrue(solution.isPalindrome(head));
    }

    @Test
    public void testLinkedListPalindromeCase2() {
        Solution solution = new Solution();
//        [1,2]
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);

        head.setNext(node1);

        assertFalse(solution.isPalindrome(head));
    }
}