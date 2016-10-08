package com.is.harsh.practice;

/**
 * Created by hshrivastava on 10/2/16.
 */
public class DRoot {

    public static void main(String[] args) {

    }

    public static int digital_root(int n) {
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return  sum;
    }
}
