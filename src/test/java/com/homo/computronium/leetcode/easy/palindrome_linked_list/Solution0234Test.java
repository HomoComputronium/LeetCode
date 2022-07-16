package com.homo.computronium.leetcode.easy.palindrome_linked_list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution0234Test {

    @Test
    public void testIsListPalindrome() {
        Solution0234 solution = new Solution0234();

        List<Integer> palindromeIntegers = List.of(1, 2, 2, 1);
        assertTrue(solution.isListPalindrome(palindromeIntegers));

        List<Integer> nonPalindromeIntegers = List.of(1, 2, 4, 5, 2, 1);
        assertFalse(solution.isListPalindrome(nonPalindromeIntegers));
    }

    @Test
    public void testLinkedListPalindromeCase1() {
        Solution0234 solution = new Solution0234();
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
        Solution0234 solution = new Solution0234();
//        [1,2]
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);

        head.setNext(node1);

        assertFalse(solution.isPalindrome(head));
    }
}