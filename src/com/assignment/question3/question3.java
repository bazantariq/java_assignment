package com.assignment.question3;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess , dice;
        do {
            System.out.println("Enter guess number");
            guess = sc.nextInt();
            dice = (int)(Math.random()*6)+1;
            System.out.println(dice);
            if (guess>dice){
                System.out.println("Oops! your guess is higher then dice number");
            }
            else if (guess<dice) {
                System.out.println("Oops! your guess is lower then dice number");
            }
        }
        while (guess!=dice);
        System.out.println("Congrats! Your guess and dice values are same.");
    }
}
