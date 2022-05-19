package com.corejavafunc.ha;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class PrimeNumberBrute {

    public static boolean checkPrime(int number)
    {
        for(int i = 2; i < number; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }

    public static void generatePrimeNumbers(int number) {
        // start our logic part
        for(int i = 2; i <= number; i++) {
            // check prime function will called
            if (checkPrime(i)) {

                System.out.println(i);

            }
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // user will enter value of number
        int number;
        System.out.println("Enter a number : ");
        number = Integer.parseInt(br.readLine());
        // create the method which will generate prime numbers
        generatePrimeNumbers(number);
    }
}
