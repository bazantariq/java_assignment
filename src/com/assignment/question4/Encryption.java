package com.assignment.question4;

import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, temp;
        System.out.print("Enter twelve digit number to encrypt");
        long number = sc.nextLong();
        d1 = ((number / 100000000000L) + 25) % 10;
        d2 = ((number / 10000000000L) % 10 + 25) % 10;
        d3 = ((number / 1000000000) % 10 + 25) % 10;
        d4 = ((number / 100000000) % 10 + 25) % 10;
        d5 = ((number / 10000000) % 10 + 25) % 10;
        d6 = ((number / 1000000) % 10 + 25) % 10;
        d7 = ((number / 100000 % 10) + 25) % 10;
        d8 = ((number / 10000 % 10) + 25) % 10;
        d9 = ((number / 1000 % 10) + 25) % 10;
        d10 = ((number / 100 % 10) + 25) % 10;
        d11 = ((number / 10) % 10 + 25) % 10;
        d12 = ((number % 10) + 25) % 10;


        //swiping
        temp = d1;
        d1 = d2;
        d2 = d3;
        d3 = d4;
        d4 = d5;
        d5 = d6;
        d6 = d7;
        d7 = d8;
        d8 = d9;
        d9 = d10;
        d10 = d11;
        d11 = d12;
        d12 = temp;
        System.out.println("Your Encrypted Number is :" + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + d10 + "" + d11 + "" + d12);

    }

}
