package com.assignment.question2;
/*
    Create a java class named Fish that stores information about Fish. It should contain the following:
            	Variables to store the name of the fish (Mullee, Rohu, or Theila), the number of Parsley Sauce, the number of Mint Sauce, and the number of Salmoriglio Sauce.
            	Constructor(s) that set all of the instance variables.
            	Methods to get and set the instance variables.
            	A method named calculateBill( ) that returns a double that is the cost of the fish.
    Fish cost is determined by:
    i) Mullee: $15 + $3 per sauce
    ii) Rohu: $25 + $5 per sauce
    iii) Theila: $35 + $7 per Sauce
	Public method named showDescription( ) that returns a String containing the fish name, quantity of each sauce.
    Write code to create several fishes and output their descriptions. For example, a Mullee Fish with one mint sauce, two parsley sauce and three salmoriglio sauce should cost a total of $33. Now Create a class named FishOrder that allows up to three Fish objects to be saved in an order. Finally call showDescription( ) and calculateBill( ) for every object.
*/

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
