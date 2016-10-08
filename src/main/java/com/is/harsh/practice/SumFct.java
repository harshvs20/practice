package com.is.harsh.practice;

import java.math.BigInteger;

/**
 * Created by hshrivastava on 10/2/16.
 */
public class SumFct {

    public static void main(String[] args) {
//        System.out.print(febSum(BigInteger.valueOf(6)));
        System.out.print(perimeter(BigInteger.valueOf(7)));
    }

    public static BigInteger perimeter(BigInteger n) {
        return BigInteger.valueOf(4).multiply(febSum(n));
    }

    private static BigInteger febSum(BigInteger number){
        if(number == BigInteger.ZERO){
            return BigInteger.ZERO;
        }
        if(number == BigInteger.ONE){
            return BigInteger.ONE;
        }
        BigInteger fibo1 = BigInteger.ONE;
        BigInteger fibo2 = BigInteger.ONE;
        BigInteger temp = BigInteger.ZERO;
        BigInteger sum = BigInteger.ONE;
        while(number!=BigInteger.ZERO){
            temp = fibo1.add(fibo2);
            sum = sum.add(fibo2);
            fibo1 = fibo2;
            fibo2 = temp;
            number = number.subtract(BigInteger.ONE);
        }
        return sum;
    }
}
