/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastack;

import java.util.*;

class JavaStack {

    static void push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(i);
        }
    }

    static void pop(Stack<Integer> stack) {
        System.out.println("Pop :");
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    static void top(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top : " + element);
    }

    static void search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is found at position " + pos);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        push(stack);
        pop(stack);
        push(stack);
        top(stack);
        search(stack, 2);
        search(stack, 6);
    }
}
