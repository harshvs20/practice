package com.is.harsh.practice;

import java.util.Stack;

/**
 * Created by hshrivastava on 10/3/16.
 */
public class DigPow {

    public static void main(String[] args) {
        System.out.print(digPow(46288,3));
    }

    public static long digPow(int n, int p) {
        int temp = n;
        Stack<Integer> stack = new Stack<>();
        while(n > 0){
            stack.push(n % 10);
            n = n / 10;
        }
        int sum = 0;
        while (!stack.isEmpty()){
            int number = stack.pop();
            sum = sum + (int) Math.pow((double)number,(double)p);
            p++;
        }
        if(sum % temp == 0){
            return sum / temp ;
        }
        return -1;
    }
}
