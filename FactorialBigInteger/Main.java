package com.company;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int k = s.nextInt();

        System.out.println("Factorial for n is: " + factorial(n) + "\n Factorial for k is: " + factorial(k));

        BigInteger X = factorial(n);
        BigInteger Y = BigInteger.TEN;
        BigInteger Z = BigInteger.ZERO;
        BigInteger result = X.mod(Y);


        while(result == Z) {

                X = X.divide(Y);
                result = X.mod(Y);
                System.out.println("here " + X);

        }
        BigInteger M = BigInteger.valueOf(1000000);
        BigInteger RESULT = X.mod(M);

        System.out.println("So here is answer: " + RESULT);

        //System.out.println(fact);  fact.toString()
    }


    public static BigInteger factorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
            //System.out.println(fact);
        }
        return fact;

    }
}
