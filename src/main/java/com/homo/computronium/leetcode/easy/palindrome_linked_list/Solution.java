package com.homo.computronium.leetcode.easy.palindrome_linked_list;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        String valuesString = "";

        valuesString = valuesString + head.val;
        while (head.next != null) {
            head = head.next;
            valuesString = valuesString + head.val;
        }
        return isStringPalindrome(valuesString);
    }

    public boolean isStringPalindrome(String string) {
        int middleIndex = string.length()/ 2;
        String firstFragment = string.substring(0, getMiddleForFirstFragment(string.length()));
        String secondFragment = string.substring(middleIndex);

        secondFragment = new StringBuilder(secondFragment).reverse().toString();

        return firstFragment.equals(secondFragment);
    }

    private int getMiddleForFirstFragment(int length) {
        return length % 2 == 0 ? (length / 2) : ((length + 1) / 2);
    }
}
