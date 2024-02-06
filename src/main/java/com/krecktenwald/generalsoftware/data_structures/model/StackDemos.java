package com.krecktenwald.generalsoftware.data_structures.model;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class StackDemos {

    public void stackDemo(){
        // Create a deque (double-ended queue) as a stack
        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Peek at the top element without removing it
        System.out.println("Top element: " + stack.peek());

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Iterating using enhanced for loop
        System.out.println("Iterating using enhanced for loop:");
        for (Integer element : stack) {
            System.out.println(element);
        }

        // Iterating using iterator
        System.out.println("\nIterating using iterator:");
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
