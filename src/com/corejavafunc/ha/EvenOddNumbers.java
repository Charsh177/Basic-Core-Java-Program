package com.corejavafunc.ha;

import java.util.Scanner;

public class EvenOddNumbers {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = reader.nextInt();

        // solve using ternary operator
        String evenOdd = (number % 2 == 0) ? "even number" : "odd number";

        System.out.println(number + " is " + evenOdd);

    }
}
