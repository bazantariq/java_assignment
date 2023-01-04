package com.assignment.question3;
import java.util.Scanner;
/*Let's assume that you have a dice which, when rolled, gives a number between 1 and 6.
You are supposed to guess what the number is?
If your guess number is higher than the dice number, the program should display
“Oops! your guess is higher than dice number.” If your guess number is lower then the dice number, the program should display
 “Oops! your number is lower than dice number.” The program should use a do-while loop that
 repeats until you correctly guess the dice number. */
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess , dice;
        do {
            System.out.println("Enter guess number: ");
            guess = sc.nextInt();

            dice = (int)(Math.random()*6)+1;
            System.out.println("Dice number is: "+dice);

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
