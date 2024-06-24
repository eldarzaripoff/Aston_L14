package ru.netology;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        BigInteger result = factorialHavingLargeResult(10);
        System.out.println(result);
    }

    public static BigInteger factorialHavingLargeResult(int n) throws IllegalArgumentException {
        BigInteger result = BigInteger.ONE;
        if (n > 0) {
            for (int i = 2; i <= n; i++)
                result = result.multiply(BigInteger.valueOf(i));
            return result;
        } else throw new IllegalArgumentException();
    }
}