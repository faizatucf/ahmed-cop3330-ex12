/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class interest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double principal, rate, year, investment;
        System.out.println("Enter the principal:");
        principal = sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        rate = sc.nextDouble();
        System.out.println("Enter the number of years:");
        year = sc.nextDouble();
        investment = (principal * (1 + ((rate/100.00)*year)));
        System.out.println(String.format("After %.0f years at %.2f%%, the investment will be worth $%.2f.", year,rate,investment));
    }
}