package com.is.harsh.practice;

import java.util.Stack;

/**
 * Created by hshrivastava on 9/25/16.
 */
public class SortStackRecur {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);
        stack.push(1);
        sortStack(stack);
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    private static void sortStack(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sortStack(stack);
            insertSorted(stack, temp);
        }
    }

    private static void insertSorted(Stack<Integer> stack, int element){
        if(stack.isEmpty() || element > stack.peek()){
            stack.push(element);
        }
        else{
            int temp = stack.pop();
            insertSorted(stack, element);
            stack.push(temp);
        }
    }
}
