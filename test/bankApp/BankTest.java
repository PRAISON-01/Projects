package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private  Bank bank;

    @BeforeEach
    public void setUp() {
         bank = new Bank("Monie Point");
    }
    @Test
    public void registerAccount_returnsNewAccount() {
        Account newAccount = bank.registerCustomer("Praise", "Nwankwo", 1234);
        assertNotNull(newAccount);

        assertThrows(IllegalArgumentException.class, ()-> newAccount.getBalance());

        newAccount.enterPin(1234);
       assertEquals(0, newAccount.getBalance());
    }

    @Test
    public void registerAccountTwice_getNumberOfRegisteredAccount() {
        Account praiseAccount = bank.registerCustomer("Praise", "Nwankwo", 1234);
        assertEquals(1, bank.getNumberOfRegisteredAccount());
    }

    @Test
    public void registerAccount_FindAccount() {
        Account praiseAccount = bank.registerCustomer("Praise", "Nwankwo", 1234);
        String accountNumber = praiseAccount.getAccountNumber();
        assertEquals(praiseAccount , bank.findAccountNumber(accountNumber));
    }

    @Test
    public void registerAccount_Deposit2k_balanceIs2k() {
        Account praiseAccount = bank.registerCustomer("Praise", "Nwankwo", 1234);
        String accountNumber = praiseAccount.getAccountNumber();
        bank.deposit(accountNumber, 2000);
        assertEquals(2000, bank.checkBalance(1234, accountNumber));
    }

    @Test
    public void registerAccount_RemoveAccount_FindAccount_AccountisNotFound() {
        Account praiseAccount = bank.registerCustomer("Praise", "Nwankwo", 1234);
        String accountNumber = praiseAccount.getAccountNumber();
        assertEquals(praiseAccount , bank.findAccountNumber(accountNumber));

        bank.removeAccount(1234, accountNumber);
        assertEquals(null, bank.findAccountNumber(accountNumber));
    }

    @Test
    public void registerAccount_Deposit5k_transfer2k_checkBalanceIs3k() {
        Account praiseAccount = bank.registerCustomer("Praise", "Nwankwo", 1234);
        String praiseAccountNumber = praiseAccount.getAccountNumber();
        bank.deposit(praiseAccountNumber, 5000);
        Account emmanuelAccount = bank.registerCustomer("Emmanuel", "Nneji", 9090);
        String emmaAccountNumber = emmanuelAccount.getAccountNumber();

        bank.transfer(2000, praiseAccountNumber, emmaAccountNumber, 1234);
    }

    @Test
    public void registerAccount_Deposit2k_transferToTheSameAccount_throwsException() {
        Account praiseAccount = bank.registerCustomer("Praise", "Nwankwo", 1234);
        String accountNumber = praiseAccount.getAccountNumber();
        assertThrows(IllegalArgumentException.class, ()-> bank.transfer(1000, accountNumber, accountNumber, 1234));
    }

    @Test
//    @DisplayName
    public void registerAccount_Deposit2k_Withdraw2k_throwsException() {
        Account praiseAccount = bank.registerCustomer("Praise", "Nwankwo", 1234);
        String accountNumber = praiseAccount.getAccountNumber();
        bank.deposit(accountNumber, 2000);
        assertThrows(IllegalArgumentException.class, ()-> bank.withdraw(accountNumber, 2000 , 1234));

    }

    @Test
    public void registerAccount_Deposit2k_withDraw500_balanceIs1500() {
        Account praiseAccount = bank.registerCustomer("Praise", "Nwankwo", 1234);
        String accountNumber = praiseAccount.getAccountNumber();
        bank.deposit(accountNumber, 2000);
        bank.withdraw(accountNumber, 500, 1234);
        assertEquals(1500, bank.checkBalance(1234, accountNumber));
    }





}
