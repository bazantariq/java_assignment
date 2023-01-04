package com.assignment.question5;

/*You are playing a game on your mobile and driving car little too fast, and a police officer stops you.
Write code to compute the result, encoded as an int value: 0=No Fine, 1=5000 Fine, 2=10,000 Fine.
If speed is 40 or less, the result is 0.
If speed is between 41 and 80 inclusive, the result is 1.
If speed is 81 or more, the result is 2
(Tip: Use a random function to determine your vehicle's speed).*/
public class question5 {
    public static void main(String[] args) {
        int speed = (int) (Math.random() * 100);
        if (speed <= 40) {
            System.out.println("0: No Fine ");
        } else if (speed <= 80) {
            System.out.println("1:5000 Fine");
        } else {
            System.out.println("2: 10000 Fine");
        }
    }
}
