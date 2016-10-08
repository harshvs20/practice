package com.is.harsh.practice;

/**
 * Created by hshrivastava on 9/25/16.
 */
public class StrictlyIncreasingNumbers {

    public static void main(String[] args) {
        int n = 3;
        strictlyIncresaingNumber(0,"",n);
    }

    private static void strictlyIncresaingNumber(int start, String out, int n){
        if(n==0){
            System.out.print(out + " ");
            return;
        }
        for (int i = 0; i < 9; i++) {
            String str = out + Integer.toString(i);
            strictlyIncresaingNumber(i+1, str, n-1);
        }
    }
}
