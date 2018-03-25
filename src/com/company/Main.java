package com.company;

public class Main {

    public static void main(String[] args) {
	    MyLinkedList<String> list = new MyLinkedList<String>();
	    list.add("Connor");
	    list.add("can");
	    list.add("go");
	    list.add("fuck");
	    list.add("himself");
	    System.out.println(list);
        MyLinkedList<String> list2 = new MyLinkedList<String>();
        list2.count();
//
//	    list.remove(0);
//	    System.out.println(list);

	    System.out.println(list2.count());
//	    System.out.println(list);
		MyHashMap<String> hash = new MyHashMap<String>();
		hash.add("my ba", "12");
		System.out.println(hash.get("my ba"));
    }
}
