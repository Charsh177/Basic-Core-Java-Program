package com.corejavafunc.ha;

import java.util.Scanner;

public class SwapTwoNumbers
{
    public static void main(String[] args) {
        // num1 and num2 are to swap
        int num1, num2, x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value num1 and num2 : ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("Before swapping numbers are : " + num1 + " " + num2);

        // swapping numbers
        x = num1;
        num1 = num2;
        num2 = x;

        System.out.println("After swapping numbers are : " + num1 + " " + num2);
    }
}
