package com.company;

import java.util.ArrayList;

public class MyHashMap<T> {
    private ArrayList<MyLinkedList<MyHashMapNode<T>>> buckets;

// initialize all the buckets

    public MyHashMap() {
        this.buckets = new ArrayList<MyLinkedList<MyHashMapNode<T>>>();
        for (int i =0; i < 137; i++) {
            this.buckets.add(new MyLinkedList<MyHashMapNode<T>>());
        }
    }
    public void add(String key, T value) {
        int bucket_number = key.hashCode() % 137;
        MyLinkedList<MyHashMapNode<T>> temp_bucket = buckets.get(bucket_number);
        temp_bucket.add(new MyHashMapNode<T>(key, value));
    }

    public T get(String key) {
        int bucket_number = key.hashCode() % 137;
        MyLinkedList<MyHashMapNode<T>> temp_bucket = buckets.get(bucket_number);
        for (int i = 0; i < temp_bucket.count(); i++) {
            if (temp_bucket.get(i).key == key) {
                return temp_bucket.get(i).value;
            }
        }
        return null;
    }


}
