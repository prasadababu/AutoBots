package practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Stack;

class test {
    int i = 1;

    void jerry() {
        System.out.println("test jerry");
    }
}

class Main extends test {

    int i = 2;

    void jerry() {
        System.out.println("main jerry");
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(new ArrayList<>(stack)); // prints 1, 2, 3

        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque.pop());
        System.out.println(new ArrayList<>(deque)); // prints 3, 2, 1
    }
}