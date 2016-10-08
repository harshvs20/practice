package com.is.harsh.practice;

import java.util.Stack;

/**
 * Created by hshrivastava on 10/5/16.
 */
public class ReverseStackInPlace {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(10);
        stack.push(8);
        stack.push(19);
        stack.push(5);
        stack.push(99);

        revertStack(stack);
        System.out.print(stack);
    }



    public static void revertStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        } else {
            Integer a = s.pop();
            revertStack(s);
            appendStack(s, a);
        }
    }

    public static void appendStack(Stack<Integer> s, Integer a) {
        if (s.isEmpty()) {
            s.push(a);
            return;
        } else {
            Integer o = s.pop();
            appendStack(s, a);
            s.push(o);
        }
    }
}
