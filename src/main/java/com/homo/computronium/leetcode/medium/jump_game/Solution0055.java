package com.homo.computronium.leetcode.medium.jump_game;

import java.util.ArrayList;
import java.util.List;

// 55. Jump Game
// https://leetcode.com/problems/jump-game/
public class Solution0055 {

    private int[] numbers;
    private int len;

    public boolean canJump(int[] nums) {
        return !hasArrayZeroUnjumpableGaps(nums) && buildTree(nums);
    }

    public boolean hasArrayZeroUnjumpableGaps(int[] numbers) {
        int numZerosInRow = 0;
        boolean isPrevZero = false;
        outer: for (int i = numbers.length - 1; i >= 0; i--) {
            int number = numbers[i];
            if (number == 0) {
                numZerosInRow++;
                isPrevZero = true;
                continue;
            }
            if (number != 0 && isPrevZero) {
                isPrevZero = false;
                int sufficientStep = numZerosInRow;
                // check the whole array up to the start
                for (int j = i; j >= 0; j--) {
                    int arrayElement = numbers[j];
                    if (arrayElement <= sufficientStep) {
                        sufficientStep++;
                        if (j == 0) {
                            return true;
                        }
                    } else {
                        continue outer;
                    }
                }
            }
        }
        return false;
    }

    public boolean buildTree(int[] numbers) {
        this.numbers = numbers;
        len = numbers.length;

        Node root = new Node();
        root.setIndex(0);
        setRootValue(root);

        return createChildren(root);
    }

    private void setRootValue(Node node) {
        int index = node.getIndex();
        if (index < len){
            int value = numbers[index];
            node.setValue(value);
        }
    }

    private boolean createChildren(Node node) {
        int nodeValue = node.getValue();
        int nodeIndex = node.getIndex();

        if (node.getIndex() == len - 1) {
            return true;
        }

        for (int i = nodeIndex + 1; i <= nodeIndex + nodeValue && i < len; i++) {
            int value = numbers[i];
            if (value == 0) {
                if (i == len - 1) {
                    return true;
                }
                break;
            }
            Node child = new Node();
            child.setValue(value);
            child.setIndex(i);
            node.setChild(child);
            boolean isLast = createChildren(child);
            if (isLast) {
                return true;
            }
        }
        return false;
    }

    private static class Node {
        private int value;
        private int index;
        private List<Node> children = new ArrayList<>();

        public Node() {
        }

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public void setChild(Node child) {
            this.children.add(child);
        }

        public int getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }
    }

}


