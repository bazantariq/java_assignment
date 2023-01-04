package com.assignment.question3;

import java.util.Random;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
        int n , dice;
        do {
            System.out.println("Enter Guess number");
            n = sc.nextInt();
            dice = ra.nextInt(6)+1;
            System.out.println(dice);
            if (n>dice){

                System.out.println("Oops! your guess is higher then dice number");
            }
            else if (n<dice) {
                System.out.println("Oops! your guess is lower then dice number");
            }
        }
        while (n!=dice);
        System.out.println("Equal");
    }
}
