package com.assignment.question2;

public class FishOrder {
    public static void main(String[] args) {
        Fish order1 = new Fish("Mullee", 3, 3, 3);
        Fish order2 = new Fish("Rohu", 25, 5, 4);
        Fish order3 = new Fish("Theila", 35, 7, 6);


        System.out.println(order1.showDescription());
        System.out.println(order1.calculateBill());

        System.out.println(order2.showDescription());
        System.out.println(order2.calculateBill());

        System.out.println(order3.showDescription());
        System.out.println(order3.calculateBill());
    }

}
