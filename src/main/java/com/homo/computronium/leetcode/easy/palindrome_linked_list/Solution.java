package com.homo.computronium.leetcode.easy.palindrome_linked_list;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> integers = new ArrayList();
        integers.add(head.val);

        while (head.next != null) {
            head = head.next;
            integers.add(head.val);
        }
        return isListPalindrome(integers);
    }

    public boolean isListPalindrome(List<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            Integer leftInt = integers.get(i);
            Integer rightInt = integers.get(integers.size() - 1 - i);
            if (leftInt.equals(rightInt)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
