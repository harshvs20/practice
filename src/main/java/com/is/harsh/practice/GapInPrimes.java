package com.is.harsh.practice;

/**
 * Created by hshrivastava on 9/27/16.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class GapInPrimes {

    public static void main(String[] args) {
        System.out.print(Arrays.toString(GapInPrimes.gap(6,100,110)));
    }

    public static long[] gap(int g, long m, long n) {
        List<Long> primeList =  LongStream.rangeClosed(m,n).filter(element -> isPrime(element)).boxed().collect(Collectors.toList());
        for(int i = 0; i < primeList.size();i++){
            if(i!=primeList.size()-1)
            if(primeList.get(i+1)-primeList.get(i)==Long.valueOf(Integer.valueOf(g))){
                return new long[]{primeList.get(i), primeList.get(i+1)};
            }
        }
        return null;
    }

    public static boolean isPrime(long number){
        for(long i = 2; i < number; i++){
            if(number%i==0) return false;
        }
        return true;
    }

}
