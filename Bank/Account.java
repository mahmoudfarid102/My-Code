/**
 * Class Account represent an Account in the bank
 * @author Abdelaziz Khalid Kamil
 * Date: 24/4/2021
 */
public class Account {

    /**
     * the current balance in the account
     */
    private double balance;
    /**
     * Account number of the Account
     */
    private int accountNumber;

    /**
     * Default constructor to class Account
     */
    public Account(){
        balance = 0;
        accountNumber = 0;
    }
    /**
     * Creates new Account with given balance, account number
     * @param balance for account balance
     * @param accountNumber for account number
     */
    public Account(double balance , int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    /**
     * gets the Account's balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * gets the Account's number
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * sets balance for the account
     * @param balance how many balance will the account have after this operation
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * sets accountNumber for the account
     * @param accountNumber for account number to be assigned to this account
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * override toString function to show the account information
     * @return account information
     */
    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }

    /**
     * allow the user or the client to withdraw from the account
     * account balance decreases is the operation succeeded
     * @param amount for the amount will be withdrawn from this account
     */
    public void withdraw(double amount){
        if (amount <= balance){
            balance -=amount;
            System.out.println("Operation succeeded");
            System.out.println("remaining balance = " + balance);
        }
        else{
            System.out.println("Operation failed");
            System.out.println("current balance = " + balance);
        }

    }

    /**
     * allow the user or the client to deposit money into the account
     * account balance increases is the operation succeeded
     * @param amount for the amount will be added to the account
     */
    public void deposit(double amount){
        balance += amount;
        System.out.println("Operation succeeded");
        System.out.println("Balance = " + balance);
    }
}