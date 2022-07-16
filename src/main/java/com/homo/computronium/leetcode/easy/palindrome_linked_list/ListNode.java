package com.homo.computronium.leetcode.easy.palindrome_linked_list;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
