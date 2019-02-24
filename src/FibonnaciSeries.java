/*
 * Developed by Sijar Ahmed on 28/1/19 5:34 PM
 * Last modified 28/1/19 5:34 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface Fibbonaci is responsible for generating mathemetical fibonacci series
 * @author sijarahmed
 * 28/1/19 5:34 PM
 *
 */

import java.util.ArrayList;
import java.util.List;

public class FibonnaciSeries {


    public static void generateFibonnaci(long limit){
        long f0 = 0;long f1 = 1;long f2;
        fibonnaciSeries.add(String.valueOf(f0));
        fibonnaciSeries.add(String.valueOf(f1));
        limit = limit-2;

        do {
            f2 = f0 + f1;
            String fib2_str = String.valueOf(f2);

            if(isEven(f2)) {
                fib2_str += "(e)";
            }
            if(isPrime(f2)) {
                fib2_str += "(p)";
            }
            fibonnaciSeries.add(fib2_str);

            f0 = f1;
            f1 = f2;
            --limit;
        }while(limit > 0);
    }


    private static boolean isEven(long n){
        return n%2==0?true:false;
    }

    private static boolean isPrime(long n){
        if(n<=2)return false;
        for(int i=2;i<n-1;++i){
            if(n%i==0) {
                System.out.println(n + " is divisible by " + i);
                return false;
            }
        }
        return true;
    }

    public static List<String> fibonnaciSeries = new ArrayList<String>();


    public static void main(String[] args) {
        FibonnaciSeries.generateFibonnaci(50);
        System.out.println(FibonnaciSeries.fibonnaciSeries);
    }



}
