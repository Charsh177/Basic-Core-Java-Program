package com.corejavafunc.ha;

import java.util.Scanner;

public class LeapYearCheck
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year yyyy : ");
        int year = sc.nextInt();
        int check = year % 4;

        if (check == 0 )
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }

    }
}
