package com.company;

class NewTreeNode<T> {
    public T value;
    public NewTreeNode<T> left;
    public NewTreeNode<T> right;

    public NewTreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}