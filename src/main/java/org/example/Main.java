package org.example;


import org.example.utils.ChekPrime;
import org.example.utils.PrimeArray;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {-5,-10,0,1,2,300,4,5,6,701,101, 102,201, 200, 206,205,204, 302,1001,907};
        int length = array.length;

       // System.out.println(ChekPrime.chekPrime(907));
       // System.out.println(PrimeArray.sumPrimeArray(array));
       // System.out.println(PrimeArray.countPrime(array));
       // System.out.println(PrimeArray.maxNumArray(array));
        System.out.println(PrimeArray.maxEvenNumArray(array));
       // System.out.println(PrimeArray.sumPrimeDivOfNum(9));
    }
}