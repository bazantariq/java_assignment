package com.assignment.question1;

import java.util.Scanner;
/*
Suppose you are developing a mobile wallet application. The application requests the user's username and password. Your roll number serves as your default username and password. If authentication is unsuccessful, the message "Please check your username and password and reenter it" will appear. The following options will be displayed by the application if the username and password are correct:
        1.	Check Balance
        2.	Withdraw Cash
        3.	Pay Bills
        4.	Change Password

        	The application will display the user's current amount and deduct Rs. 2.5/- as a service charge from user’s account if option 1, "Check Balance" is chosen.
        	The application will ask user to enter amount for withdrawal and it will subtract this amount from the user's account together with a service charge of Rs. 18.50/- if option 2, "Withdraw Cash" is chosen. Additionally, the application will ask the user if he/she wants a receipt or not? If the user accepts to receive a receipt for this transaction, the application will update his/her balance and subtract the service fee of Rs. 2.5/-.
        	The application will ask the user to enter the bill reference number and the amount in order to deduct the appropriate amount from his/her account and display "Transaction Success" if option 3, "Pay Bills" is chosen. Additionally, the application will add 25% of the paid amount to user’s account as cash-back.
        	The application will prompt the user to input both his old and new passwords if option 4, "Change Password" is chosen. The application will also verify whether the user entered their old password correctly or not and it will display an error notice if the user enters incorrect password. The application will finally display "Password Updated."
*/

public class question1 {
    public static void main(String a[]) {
        String default_username = "SOFTF22BSR01", default_password = "SOFTF22BSR01";
        String username, password;
        int option;
        double balance = 9999999;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username");
        username = sc.nextLine();
        System.out.println("Enter password");
        password = sc.nextLine();

        if (username.equals(default_username) && password.equals(default_password)) {
            System.out.println("1: Check Balance\n2: Withdraw Cash\n3: Pay Bills\n4: Change Password");
            System.out.println("Selection any option:");
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("Your balance is: " + (balance - 2.5));
            } else if (option == 2) {
                System.out.println("Enter amount for withdrawal");
                double amount = sc.nextDouble();
                balance = (balance - 18.50) - amount;
                System.out.println("Select Receipt Option:\n1: Need Receipt\n2. No");
                int receipt = sc.nextInt();
                if (receipt == 1) {
                    balance = balance - 2.5;
                    System.out.println("Remaining Balace is:" + balance);
                } else {
                    System.out.println("Remaining Balace is:" + balance);
                }
            }
            if (option == 3) {
                System.out.println("Enter bill amount");
                double bill_amount = sc.nextDouble();
                double cashback = bill_amount * (25 / 100f);
                balance = (balance - bill_amount) + cashback;
                System.out.println("Transaction Success\nRemaining Balance is: " + balance);
            }
            if (option == 4) {
                System.out.println("Enter default password");
                Scanner sn = new Scanner(System.in);
                String default_password2 = sn.nextLine();

                if (default_password2.equals(default_password)) {
                    System.out.println("Enter New Password");
                    default_password = sn.nextLine();
                    System.out.println("Password updated: " + default_password);
                }
            }
        } else {
            System.out.println("Invalid username or password");
        }
    }
}