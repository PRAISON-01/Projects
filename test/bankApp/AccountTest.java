package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest{

    private Account myAccount;

    @BeforeEach
    public void setUp() {
        myAccount = new Account();
    }
    @Test
    public void deposit200_balanceIs200Test() {
//        Account myAccount = new Account();
        assertEquals(0,myAccount.getBalance());

        myAccount.deposit(200);
        assertEquals(200, myAccount.getBalance());
    }

    @Test
    public void deposit200AndThen500_balanceIs700Test() {
//        Account myAccount = new Account();
        assertEquals(0,myAccount.getBalance());

        myAccount.deposit(200);
        myAccount.deposit(500);
        assertEquals(700, myAccount.getBalance());
    }

    @Test
    public void depositNegative200_balanceIsZero() {
        myAccount.deposit(-200);
        assertEquals(0, myAccount.getBalance());
    }

    @Test
    public void withdraw500From0_balanceIs0() {
        myAccount.withdraw(500);
        assertEquals(0, myAccount.getBalance());
    }

    @Test
    public void withdraw500From5000_balanceIs4500() {

        myAccount.deposit(5000);
        assertEquals(5000, myAccount.getBalance());

        myAccount.withdraw(500);
        assertEquals(4500, myAccount.getBalance());
    }

    @Test
    public void withdrawNegative500From5000_balanceIs5000() {
        myAccount.deposit(5000);
        assertEquals(5000, myAccount.getBalance());

        myAccount.withdraw(-500);
        assertEquals(5000, myAccount.getBalance());
    }

    @Test
    public void withdraw500from500_balanceIs500() {
        myAccount.deposit(500);
        assertEquals(500, myAccount.getBalance());

        myAccount.withdraw(500);
        assertEquals(500, myAccount.getBalance());
    }



}
