package com.company;

class NewBinaryTree {
    public static NewTreeNode<Integer> BuildTreeRecursively(int min, int max) {

        // base cases
        int diff = max - min;
        if (diff == 0) {
            return new NewTreeNode<Integer>(min);
        } else if (diff == 1) {
            NewTreeNode<Integer> newChild = new NewTreeNode<Integer>(max);
            newChild.left = new NewTreeNode<Integer>(min);
            return newChild;   
        } else if (diff == 2) {
            NewTreeNode<Integer> newChild = new NewTreeNode<Integer>(max - 1);
            newChild.left = new NewTreeNode<Integer>(min);
            newChild.right = new NewTreeNode<Integer>(max);
            return newChild;
        }

        // recursive case
        int midpoint = min + ((max - min) / 2);
        NewTreeNode<Integer> newChild = new NewTreeNode<Integer>(midpoint);
        newChild.left = NewBinaryTree.BuildTreeRecursively(min, midpoint - 1);
        newChild.right = NewBinaryTree.BuildTreeRecursively(midpoint + 1, max);
        return newChild;
    }
}