package org.example.utils;
public class PrimeArray {
    public static Integer sumPrimeArray(Integer[] array){
        //этот метод возвращает сумму простых числе в массиве
        Integer sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (ChekPrime.chekPrime(array[i])){
                sum = sum + array[i];
            }
        }
        return sum;
    }
    public static Integer countPrime(Integer[] array){
        //метод возвращает кол-во простых числел в массиве
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (ChekPrime.chekPrime(array[i])){
                count++;
            }
        }
        return count;
    }
    public static Integer maxNumArray(Integer[] array){
        //метод возвращает максимальное число в массиве
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum ){
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public static Integer maxEvenNumArray(Integer[] array){
        // метод возвращает максимальное четное число в массиве
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (chekEvenNum(array[i])){
                if (array[i]>maxNum)
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public static Integer sumPrimeDivOfNum(Integer num){
        //метод возвращает сумму простых делителей числа
        Integer sum = 0;
        for (int i = 0; i < num; i++) {
            if (ChekPrime.chekPrime(i) == true){
                sum = sum + i;
            }
        }
        return sum;
    }
    private static boolean chekEvenNum(Integer num){
        // проверка числа на то простое оно или нет
        if (num % 2 !=0){
            return false;
        }else
        return true;
    }
}
