package com.corejavafunc.ha;

import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a dividend number : ");
        int dividend = scanner.nextInt();

        System.out.println("Enter a divisor number : ");
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient is : " + quotient);
        System.out.println("Remainder is : " + remainder);
    }
}
