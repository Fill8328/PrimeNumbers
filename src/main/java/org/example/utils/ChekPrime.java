package org.example.utils;

public class ChekPrime {
    // этот метод проверят простое число или нет
    public static boolean chekPrime(Integer num) {
        boolean isPrime = false;
        if (num<0){
            return false;
        }
        if (num == 0){
            System.out.println(" U enter 0");
            return false;
        }
        if (num == 1){
            System.out.println(num + " has 1 divisor ");
            return false;
        }
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int temp = num % i;
            if (temp == 0){
             count++;
             if (count>=3){
                 System.out.println(num + " Not Prime");
                 break;
             }
            }
        }
        if (count == 2){
            System.out.println(num + " Prime");
            isPrime = true;
        }
        return isPrime;
    }
}
