package bankApp;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String number;
    private int pin;
    private int count;


    private final ArrayList<Account> accounts = new ArrayList<>();


    public Bank(String bankName) {
    }

    public Account registerCustomer(String firstName, String lastName , int pin) {
        String generatedAccountNumber = " " + (int)(Math.random() * 10000000) + 999999999;


        this.name = firstName + " " + lastName;
        this.pin = pin;

        Account newAccount = new Account(generatedAccountNumber);
        newAccount.setPin(pin);


        this.accounts.add(newAccount);
        count = count + 1;
        return newAccount;
    }

    public int getNumberOfRegisteredAccount() {
        return count;
    }

    public Account findAccountNumber(String accountNumber) {
        for(Account account : this.accounts) {
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public void deposit(String accountNumber, int amount) {
        Account account = findAccountNumber(accountNumber);
        account.deposit(amount);
    }

    public int checkBalance(int pin, String accountNumber) {
        Account account = findAccountNumber(accountNumber);
        account.enterPin(pin);
        return account.getBalance();
    }


    public void removeAccount(int pin, String accountNumber) {
        Account account = findAccountNumber(accountNumber);
        if(account.getAccountNumber().equals(accountNumber)) {
            accounts.remove(account);
        }
    }


    public void transfer(int amount, String sender, String receiver, int pin) {
        if(sender.equals(receiver)) throw new IllegalArgumentException("Can't send to the same account!!!");
        Account senderAccount = findAccountNumber(sender);
        Account receiverAccount = findAccountNumber(receiver);

        senderAccount.withdraw(amount);
        receiverAccount.deposit(amount);
    }
}
