package com.is.harsh.practice;

import java.math.BigInteger;

/**
 * Created by hshrivastava on 10/2/16.
 */
public class TrailingZeros {

    public static void main(String[] args) {
        System.out.print(zeros(19));
    }

    public static int zeros(int n) {
        BigInteger factorial = factorial(n);
        BigInteger mod = BigInteger.TEN;
        int count = 0;
        while(factorial.mod(mod) == BigInteger.ZERO){
            mod = mod.multiply(BigInteger.TEN);
            count++;
        }
        return count;
    }

    public static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
