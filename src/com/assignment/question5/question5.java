package com.assignment.question5;

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
