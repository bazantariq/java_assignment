# Assignment
Total Marks: 10
Deadline: December 25, 2022
Instructions:
•	All questions carry equal marks.
•	Copy assignment is strictly prohibited. If any student will copy the assignment, it will be fined with zero marks.
•	Deadline for submission your assignment is December 25, 2022.
•	The assignment file name must be your roll number e.g., COMPF22BSR01. If the name of assignment is anything other than your roll number than the assignment will be considered invalid and zero marks will be given.
•	Send your assignment as soft copy by email at tariq@xs.ustb.edu.cn
Question 1: Suppose you are developing a mobile wallet application. The application requests the user's username and password. Your roll number serves as your default username and password. If authentication is unsuccessful, the message "Please check your username and password and reenter it" will appear. The following options will be displayed by the application if the username and password are correct:
1.	Check Balance
2.	Withdraw Cash
3.	Pay Bills
4.	Change Password

	The application will display the user's current amount and deduct Rs. 2.5/- as a service charge from user’s account if option 1, "Check Balance" is chosen.
	The application will ask user to enter amount for withdrawal and it will subtract this amount from the user's account together with a service charge of Rs. 18.50/- if option 2, "Withdraw Cash" is chosen. Additionally, the application will ask the user if he/she wants a receipt or not? If the user accepts to receive a receipt for this transaction, the application will update his/her balance and subtract the service fee of Rs. 2.5/-.
	The application will ask the user to enter the bill reference number and the amount in order to deduct the appropriate amount from his/her account and display "Transaction Success" if option 3, "Pay Bills" is chosen. Additionally, the application will add 25% of the paid amount to user’s account as cash-back.
	The application will prompt the user to input both his old and new passwords if option 4, "Change Password" is chosen. The application will also verify whether the user entered their old password correctly or not and it will display an error notice if the user enters incorrect password. The application will finally display "Password Updated."
Question 2: Create a java class named Fish that stores information about Fish. It should contain the following:  
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
Question 3:  Let's assume that you have a dice which, when rolled, gives a number between 1 and 6. You are supposed to guess what the number is? If your guess number is higher than the dice number, the program should display “Oops! your guess is higher than dice number.” If your guess number is lower then the dice number, the program should display “Oops! your number is lower than dice number.” The program should use a do-while loop that repeats until you correctly guess the dice number. 
Question 4: WhatsApp wants to send numeric data over the Internet and the company asked you to write a program that will encrypt data so that it may be transmitted more securely. All the data is transmitted as twelve-digit integers. Your application should read a twelve-digit integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 25 to the digit. Then swap the first digit with the second, second digit with the third and so on and finally last digit with first. Then print the encrypted integer. Write a separate program that inputs an encrypted twelve-digit integer and decrypts it (by reversing the encryption scheme) to form the original number.
Question 5: You are playing a game on your mobile and driving car little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=No Fine, 1=5000 Fine, 2=10,000 Fine. If speed is 40 or less, the result is 0. If speed is between 41 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2 (Tip: Use a random function to determine your vehicle's speed).

End
