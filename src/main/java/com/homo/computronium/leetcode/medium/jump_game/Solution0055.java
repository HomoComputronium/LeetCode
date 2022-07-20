package com.homo.computronium.leetcode.medium.jump_game;

import java.util.ArrayList;
import java.util.List;

// 55. Jump Game
// https://leetcode.com/problems/jump-game/
public class Solution0055 {

    private int[] numbers;
    private int len;

    public boolean canJump(int[] nums) {
        Node root = buildTree(nums);
        return traverseTree(root);
    }

    public boolean traverseTree(Node node) {
        if (node != null) {
            if (node.getIndex() == len -1) {
                return true;
            }
            List<Node> children = node.getChildren();
            for (Node child : children) {
                boolean isLast = traverseTree(child);
                if (isLast) {
                    return true;
                }
            }
        }
        return false;
    }

    public Node buildTree(int[] numbers) {
        this.numbers = numbers;
        len = numbers.length;

        Node root = new Node();
        root.setIndex(0);
        setValue(root);

        createChildren(root);

        return root;
    }

    private void setValue(Node node) {
        int index = node.getIndex();
        if (index < len){
            int value = numbers[index];
            node.setValue(value);
        }
    }

    private void createChildren(Node node) {
        int nodeValue = node.getValue();
        int nodeIndex = node.getIndex();

        for (int i = nodeIndex + 1; i <= nodeIndex + nodeValue && i < len; i++) {
            int value = numbers[i];
            Node child = new Node();
            child.setValue(value);
            child.setIndex(i);
            node.setChild(child);
            createChildren(child);
        }
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

        public List<Node> getChildren() {
            return children;
        }
    }

}


