package com.assignment.question4;

import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, temp;
        System.out.print("Enter twelve digit encrypted number");
        long n = sc.nextLong();

        d1 = 25 + (n / 100000000000L);
        d2 = 25 + (n / 10000000000L) % 10;
        d3 = 25 + (n / 1000000000) % 10;
        d4 = 25 + (n / 100000000 % 10);
        d5 = 25 + (n / 10000000 % 10);
        d6 = 25 + (n / 1000000 % 10);
        d7 = 25 + (n / 100000 % 10);
        d8 = 25 + (n / 10000 % 10);
        d9 = 25 + (n / 1000 % 10);
        d10 = 25 + (n / 100 % 10);
        d11 = 25 + (n / 10 % 10);
        d12 = 25 + ((n % 10));
        d1 %= 10;
        d2 %= 10;
        d3 %= 10;
        d4 %= 10;
        d5 %= 10;
        d6 %= 10;
        d7 %= 10;
        d8 %= 10;
        d9 %= 10;
        d10 %= 10;
        d11 %= 10;
        d12 %= 10;
        temp = d12;
        d12 = d11;
        d11 = d10;
        d10 = d9;
        d9 = d8;
        d8 = d7;
        d7 = d6;
        d6 = d5;
        d5 = d4;
        d4 = d3;
        d3 = d2;
        d2 = d1;
        d1 = temp;
        System.out.println("Your decrypted number is: " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + d10 + "" + d11 + "" + d12);
    }
}