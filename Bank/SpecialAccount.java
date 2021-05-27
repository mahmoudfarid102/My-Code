/**
 * Class SpecialAccount represent special Account in the bank
 * Class SpecialAccount inherits from class Account
 * @author Abdelaziz Khalid Kamil
 * Date: 24/4/2021
 */
public class SpecialAccount extends Account{
    /**
     * Default constructor to class SpecialAccount
     */
    public SpecialAccount() {
        super();
    }

    /**
     * Creates new special Account with given balance, account number using super class's constructor
     * @param balance for account balance
     * @param accountNumber for account number
     */
    public SpecialAccount(double balance, int accountNumber) {
        super(balance, accountNumber);
    }

    /**
     * override withdraw function inherited from class Account
     * @param amount for the amount of money to be withdrawn
     */
    @Override
    public void withdraw(double amount) {
        if (amount <=getBalance()){
            setBalance(getBalance() - amount);
            System.out.println("Operation succeeded");
            System.out.println("remaining balance = " + getBalance());
        }
        else{
            if((getBalance() - amount) >= -1000){
                setBalance(getBalance() - amount);
                System.out.println("Operation succeeded");
                System.out.println("remaining balance = " + getBalance());
            }
            else{
                System.out.println("Operation failed\nYou have passed your over drafting limit.");
                System.out.println("current balance = " + getBalance());
            }

        }
    }
}