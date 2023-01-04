package com.assignment.question1;

public class mobilewallet {
    double balance;
    String password ;

    public mobilewallet(double b1) {

        this.balance = b1;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int b1) {
        this.balance = b1;
    }

    public float deduct (float dt){
        this.balance=  balance-dt;
        return dt;
    }

}
