package com.assignment.question4;

import java.util.Scanner;
/*WhatsApp wants to send numeric data over the Internet and the company asked you to write a program that will encrypt data so that it may be transmitted more securely. All the data is transmitted as twelve-digit integers. Your application should read a twelve-digit integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 25 to the digit. Then swap the first digit with the second, second digit with the third and so on and finally last digit with first. Then print the encrypted integer. Write a separate program that inputs an encrypted twelve-digit integer and decrypts it (by reversing the encryption scheme) to form the original number.*/
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
