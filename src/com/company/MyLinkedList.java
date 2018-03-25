package com.company;

public class MyLinkedList<T> {
    private MyLinkedListNode<T> root;

    public void add(T value) {
        if (root == null) {
            root = new MyLinkedListNode<T>(value);
        } else {
            MyLinkedListNode<T> cur = root;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new MyLinkedListNode<T>(value);
        }
    }

    public void remove(int index) {
        if (root == null) {
            return;
        }
        if (index == 0) {
            root = root.next;
            return;
        }
        MyLinkedListNode<T> cur_node = root;
        for (int i = 0; i < index - 1; i++) {
            cur_node = cur_node.next;
            if (cur_node.next == null) {
                return;
            }
        }
        if (cur_node.next.next != null) {
            cur_node.next = cur_node.next.next;
        } else {
            cur_node.next = null;
        }
    }

    public int count() {
        int count = 1;
        MyLinkedListNode<T> cur = root;
        if (cur == null) {
            return 0;
        }
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    public T get(int index) {
        MyLinkedListNode<T> cur_node = root;
        for (int i = 0; i < index; i++) {
            cur_node = cur_node.next;
            if (cur_node.next == null && i != index - 1) {
                return null;
            }
        }
        return cur_node.value;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        MyLinkedListNode<T> cur = root;
        while (cur.next != null) {
            out.append(cur.value + ", ");
            cur = cur.next;
        }
        out.append(cur.value);
        return out.toString();
    }
}
