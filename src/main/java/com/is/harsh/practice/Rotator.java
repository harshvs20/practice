package com.is.harsh.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by hshrivastava on 9/21/16.
 */
public class Rotator {

    public static void main(String[] args) {
        Rotator r = new Rotator();
        System.out.print(Arrays.toString(rotate(new Object[]{1, 2, 3, 4, 5}, 4)));
    }

    public static Object[] rotate(Object[] data, int n) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        List<Object> result = new ArrayList<>();

        if(n > data.length) return null;
        if(n == 0) return data;
        if(n > 0){
            for(Object each : data){
                stack1.push(each);
            }
            for(int i = 0 ; i < n; i++){
                stack2.push(stack1.pop());
            }
            while(!stack2.empty()){
                result.add(stack2.pop());
            }
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            while(!stack2.empty()){
                result.add(stack2.pop());
            }
            return result.toArray();
        }
        return result.toArray();
    }

}
