package com.company;
import java.util.*;

// THIS IS THE ONLY FILE WHICH NEEDS TO BE ALTERED

class HW7Sol {

    // change the size of the tree here
    private static final int treeSize = 9;

    public static void main(String[] args) {
        NewTreeNode<Integer> root = NewBinaryTree.BuildTreeRecursively(0, treeSize);
        Stack<NewTreeNode<Integer>> s = new Stack<NewTreeNode<Integer>>();
        s.push(root);
        Queue<NewTreeNode<Integer>> q = new LinkedList<NewTreeNode<Integer>>();
        q.add(root);

        // DFS
        System.out.println("-----------------");
        System.out.println("DFS");
        System.out.println("-----------------");

        // TODO: stack or queue as a parameter here???
        HW7Sol.DFS(root);

        // BFS
        System.out.println("-----------------");
        System.out.println("BFS");
        System.out.println("-----------------");
        // TODO: stack or queue as a parameter here???
        HW7Sol.BFS(root);
    }

    // DONE SORTA: implement DFS
    public static void DFS(NewTreeNode node) {
        //DFS uses Stack data structure,
        ArrayList<NewTreeNode> visited = new ArrayList<>();
        Stack<NewTreeNode> s = new Stack<>();
        s.push(node);
        visited.add(node);
        System.out.println(node.value);
        while(!s.isEmpty())
        {
            NewTreeNode n = s.peek();
            NewTreeNode child = null;
            if (visited.indexOf(n.right) == -1) {
                child = n.right;
            }
            if (visited.indexOf(n.left) == -1) {
                child = n.left;
            }
            if (child != null)
            {
                System.out.println(n.value);
                visited.add(child);
                s.push(child);
            }
            else
            {
                s.pop();
            }
        }
    }

    // DONE: implement BFS
    public static void BFS(NewTreeNode node) {
        ArrayList<NewTreeNode> visited = new ArrayList<NewTreeNode>();
        Queue<NewTreeNode> queue = new LinkedList<NewTreeNode>();
        queue.add(node);
        visited.add(node);
        System.out.println(node.value);
        while(!queue.isEmpty()) {
            NewTreeNode cur = queue.peek();
            NewTreeNode child = null;
            if (visited.indexOf(cur.right) == -1) {
                child = cur.right;
            }
            if (visited.indexOf(cur.left) == -1) {
                child = cur.left;
            }
            if (child != null) {
                System.out.println(child.value);
                visited.add(child);
                queue.add(child);
            } else {
                queue.poll();
            }
        }
    }
}


//These should return:
//
//        -----------------
//        DFS
//        -----------------
//        4
//        1
//        0
//        3
//        2
//        7
//        6
//        5
//        9
//        8
//        -----------------
//        BFS
//        -----------------
//        4
//        1
//        7
//        0
//        3
//        6
//        9
//        2
//        5
//        8