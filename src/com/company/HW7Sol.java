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
        HW7Sol.DFS(s);

        // BFS
        System.out.println("-----------------");
        System.out.println("BFS");
        System.out.println("-----------------");
        // TODO: stack or queue as a parameter here???
        HW7Sol.BFS(q);
    }

    // DONE: implement DFS
    public static void DFS(Stack<NewTreeNode<Integer>> stack) {
        if (stack.size() == 0) {
            return;
        }
        NewTreeNode<Integer> visited = stack.pop();
        System.out.println(visited.value);
        if (visited.right != null) {
            stack.push(visited.right);
        }
        if (visited.left != null) {
            stack.push(visited.left);
        }
        HW7Sol.DFS(stack);


    }

    // DONE: implement BFS
    public static void BFS(Queue<NewTreeNode<Integer>> queue) {
        if (queue.size() == 0) {
            return;
        }
        NewTreeNode<Integer> visited = (NewTreeNode<Integer>) queue.remove();
        System.out.println(visited.value);
        if (visited.right != null) {
            queue.add(visited.right);
        }
        if (visited.left != null) {
            queue.add(visited.left);
        }
        HW7Sol.BFS(queue);
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