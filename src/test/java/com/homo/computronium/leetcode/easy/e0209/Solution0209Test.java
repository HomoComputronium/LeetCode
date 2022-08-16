package com.homo.computronium.leetcode.easy.e0209;

import com.homo.computronium.leetcode.easy.e0209.array.Solution0209;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0209Test {

    @Test
    void leetCodeFiveNodesCaseArrayWay() {
        ReverseLinkedList solution = new Solution0209();
        fiveNodesCase(solution);
    }

    @Test
    void leetCodeFiveNodesCaseCopyNodesWay() {
        ReverseLinkedList solution = new com.homo.computronium.leetcode.easy.e0209.copy_nodes.Solution0209();
        fiveNodesCase(solution);
    }

    @Test
    void emptyNodeArrayWay() {
        ReverseLinkedList solution = new Solution0209();
        emptyNodeCase(solution);
    }

    @Test
    void emptyNodeCopyNodesWay() {
        ReverseLinkedList solution = new com.homo.computronium.leetcode.easy.e0209.copy_nodes.Solution0209();
        emptyNodeCase(solution);
    }

    private void fiveNodesCase(ReverseLinkedList solution) {
        ListNode head = createFiveNodesHead(1, 2, 4, 5);

        ListNode expected = createFiveNodesHead(5, 4, 2, 1);

        ListNode actual = solution.reverseList(head);
        assertEquals(expected, actual);
    }

    private ListNode createFiveNodesHead(int val, int val1, int val2, int val3) {
        return new ListNode(val,
                new ListNode(val1,
                        new ListNode(3,
                                new ListNode(val2,
                                        new ListNode(val3)))));
    }

    private void emptyNodeCase(ReverseLinkedList solution) {
        ListNode listNode = new ListNode();
        ListNode expected = new ListNode();

        assertEquals(expected, solution.reverseList(listNode));
    }

}