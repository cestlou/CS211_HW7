package com.company;

class MyLinkedListNode<T> {
    public T value;
    public MyLinkedListNode<T> next;

    public MyLinkedListNode(T value) {
        this.value = value;
        this.next = null;
    }

    public MyLinkedListNode(T value, MyLinkedListNode<T> next) {
        this.value = value;
        this.next = next;
    }
}