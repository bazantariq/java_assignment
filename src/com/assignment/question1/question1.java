package com.assignment.question1;

import java.util.Scanner;

public class question1 {
    public static void main(String a[]) {
        mobilewallet mb = new mobilewallet(1000);
        mb.deduct(2.5f);

        double balance = mb.balance;

        String username, password;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        username = sc.nextLine();
        System.out.println("Enter password");
        password = sc.nextLine();
        boolean softf22BSR01 = !password.equals("SOFTF22BSR01");
        if (!username.equals("SOFTF22BSR01") || !password.equals("SOFTF22BSR01")) {
            System.out.println("incorrect");


        } else if (username.equals("SOFTF22BSR01") && password.equals("SOFTF22BSR01")){

            System.out.println("1: Check Balance" + "\n" + "2: Withdraw Cash" + "\n" + "3: Pay Bills" + "\n" + "4: Change Password" + "\n" + "select one");
            int n;
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("your balance is: " + "\t" + mb.getBalance());
            } else if (n == 2) {
                System.out.println("Enter amount for withdraw");
                float w1 = sc.nextFloat();
                balance = balance - 18.5;
                if (w1 < balance) {
                    balance = balance - w1;

                    System.out.println("After withdraw your balance is: " + balance);
                } else {
                    System.out.println("your amount is more then balance");
                }


                if (w1 < balance) {
                    System.out.println("1: i want receipt" + "\n" + "2: no, I do not need receipt" + "\n" + "Please select one option ");
                    int v = sc.nextInt();
                    if (v == 1) {
                        balance = balance - 2.5;
                        System.out.println("your balance is now: " + balance);
                    }
                }
            }
            if (n == 3) {
                System.out.println("Enter bill amount");
                float d;
                d = sc.nextFloat();
                if (d < balance) {
                    balance = balance - d;
                    d = d * (25 / 100f);
                    balance = balance + d;
                    System.out.println("Transaction successful: " + balance);

                }
            }
            if (n == 4) {
                System.out.println("Enter old password");
                Scanner sn = new Scanner(System.in);
                String old_password = sn.nextLine();
                if (old_password.equals("SOFTF22BSR01")) {
                    System.out.println("Password is correct" + "\n" + "Now enter new password.");
                    String  new_password = sn.nextLine();
                    System.out.println("Password Updated: " + new_password);
                }else {
                    System.out.println("Error");
                }
            }
        }
    }
}
