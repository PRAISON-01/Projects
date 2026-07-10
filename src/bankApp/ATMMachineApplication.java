package bankApp;

import javax.swing.*;
import java.util.Scanner;

public class ATMMachineApplication {
    static Bank bank = new Bank("Moniepoint");


    public static void main(String[] args) {
        goToMainMenu();
    }

    private static void goToMainMenu() {
        String prompt = """
                WELCOME TO MY BANK APPLICATION
                
                1. Create accunt
                2. Deposit 
                3. Withdraw
                4. Transfer
                5. Check Balance
                6. Exit
                """;
         String word = JOptionPane.showInputDialog(prompt);
        int choice = inputInt("Enter an option >> ");
        switch(choice) {
            case 1 -> creatAccount();
            case 2 -> deposit();
            case 3 -> withdraw();
            case 4 -> transfer();
            case 5 -> checkBalance();
            case 6 -> exit();
            default -> print("Enter a valid number!!!");
        }

    }

    private static void exit(){
        print("Good bye!!!");
    }



    private static void checkBalance() {
        try{
            String accountNumber = input("Enter accountNumber >> ");
            int pin = inputInt("Enter pin >> ");
            int balance = bank.checkBalance(pin, accountNumber);
            print("Balance is " + balance + "\n");
        }
        catch (IllegalArgumentException e) {
            print("Error "+ e.getMessage() + "\n");
        }

        goToMainMenu();
    }

    private static void transfer() {
        try{
            int amount = inputInt("Enter amount to send >> ");
            String senderAccountNumber = input("Enter your account number >> ");
            String receiverAccountNumber = input("Enter account number for receiver >> ");
            int pin = inputInt("Enter pin >> ");
            bank.transfer(amount, senderAccountNumber, receiverAccountNumber, pin);
            print("Transfer successful!!!\nYour balance is " + bank.checkBalance(pin, senderAccountNumber) + " \n");
        } catch(IllegalArgumentException e){
            print("Error "+ e.getMessage() + "\n");
        }

        goToMainMenu();
    }

    private static void withdraw() {
        try{
            String accountNumber = input("Enter account number to withdraw >> ");
            int amount = inputInt("Enter Amount >> ");
            int pin = inputInt("Enter pin >> ");
            bank.withdraw(accountNumber, amount, pin);
            print("Withdrawal succesful!!!\nYour balance is " + bank.checkBalance(pin, accountNumber) + "\n");
        } catch(IllegalArgumentException e) {
            print("Error "+ e.getMessage() + "\n");
        }

        goToMainMenu();

    }

    private static void deposit() {
        try{
            String accountNumber = input("Enter account number >> ");
            int amount = inputInt("Enter Amount to deposit >> ");
            bank.deposit(accountNumber, amount);
            print("Deposit successful!!!\n");
        } catch(IllegalArgumentException e){
            print("Error "+ e.getMessage() + "\n");
        }

        goToMainMenu();
    }

    private static void creatAccount() {
        try{
            String firstName = input("Enter first name >> ");
            String lastName = input("Enter last name >> ");
            int pin = inputInt("Enter pin >> ");
            Account newAccount = bank.registerCustomer(firstName, lastName, pin);
            String accountNumber = newAccount.getAccountNumber();
            print("Account created successfully !!!\n");
            print("Your Account Number >> " + accountNumber + " << \n");
        } catch(IllegalArgumentException e) {
            print("Error "+ e.getMessage() + "\n");
        }

        goToMainMenu();
    }

    private static String input(String promptMessage) {
//        print(promptMessage);
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine().trim().replace(" ", "");
        return JOptionPane.showInputDialog(promptMessage);
    }
    private static int inputInt(String promptMessage) {
//        print(promptMessage);
//        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(JOptionPane.showInputDialog(promptMessage));

    }

    private static void print(String message) {
         System.out.println(message);
    }
    private static void print(int message) {
         System.out.println(message);
    }




}
