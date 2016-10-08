package com.is.harsh.practice;

import java.util.Stack;

/**
 * Created by hshrivastava on 10/5/16.
 */
public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(10);
        stack.push(8);
        stack.push(19);
        stack.push(5);
        stack.push(99);
        stack.sort(((o1, o2) -> o2.compareTo(o1)));
        System.out.print(stack);
    }

    public static Stack<Integer> sort(Stack<Integer>stack){
        Stack<Integer>temp=new Stack<Integer>();
        if(stack.isEmpty())
            return stack;
        temp.push(stack.pop());
        while(!stack.isEmpty()){
            int val=stack.pop();
            while(!temp.isEmpty()){
                if(temp.peek()<val)
                    stack.push(temp.pop());
                else
                    break;
            }
            temp.push(val);
        }
        return temp;
    }
}
